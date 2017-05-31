package com.tr.rp.core.rankediterators;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

import com.tr.rp.core.Expression;
import com.tr.rp.core.Rank;
import com.tr.rp.core.RankedItem;
import com.tr.rp.core.VarStore;
import com.tr.rp.exceptions.RPLException;
import com.tr.rp.statement.RankedChoice;

public class ChooseMergingIterator implements RankedIterator<VarStore> {

	private final RankedIterator<VarStore> in1;
	private final RankedIterator<VarStore> in2;

	public final PriorityQueue<RankedItem<VarStore>> pq = new PriorityQueue<RankedItem<VarStore>>(
			new Comparator<RankedItem<VarStore>>() {
				@Override
				public int compare(RankedItem<VarStore> o1, RankedItem<VarStore> o2) {
					return Rank.sub(o1.rank, o2.rank);
				}
			});
	private boolean in1next = false;
	private boolean in2next = false;
	
	private Expression rankIncrease;
	
	private int normalizationOffset = -1;
		
	public ChooseMergingIterator(RankedIterator<VarStore> in1, 
			RankedIterator<VarStore> in2, Expression rankIncrease) throws RPLException {
		this.in1 = in1;
		this.in2 = in2;
		in1next = in1.next();
		in2next = in2.next();
		this.rankIncrease = rankIncrease;
		
		// Check
		if (rankIncrease.hasRankExpression()) {
			throw new IllegalArgumentException("Expression contains rank expressions");
		}
	}
	
	@Override
	public boolean next() throws RPLException {
		if (!pq.isEmpty()) pq.remove();
		if (pq.isEmpty()) {
			if (in1next) {
				pq.add(new RankedItem<VarStore>(in1.getItem(), in1.getRank()));
				in1next = in1.next();
			}
			if (in2next) {
				pq.add(new RankedItem<VarStore>(in2.getItem(), Rank.add(in2.getRank(), rankIncrease.getIntValue(in2.getItem()))));
				in2next = in2.next();
			}
		} else {
			// Make sure we don't skip any item
			int currentRank = pq.peek().rank;
			while (in1next && in1.getRank() < currentRank) {
				pq.add(new RankedItem<VarStore>(in1.getItem(),in1.getRank()));
				in1next = in1.next();
			}
			// Here we may be adding items ranked higher than current rank,
			// but that's OK. We just need to ensure that all items that are
			// possibly ranked as low as the current rank are in pq.
			while (in2next && in2.getRank() < currentRank) {
				pq.add(new RankedItem<VarStore>(in2.getItem(),Rank.add(in2.getRank(), rankIncrease.getIntValue(in2.getItem()))));
				in2next = in2.next();
			}
		}
		// Normalize ranks
		if (!pq.isEmpty() && normalizationOffset == -1) {
			normalizationOffset = pq.peek().rank;
		}
		return !pq.isEmpty();
	}

	@Override
	public VarStore getItem() throws RPLException {
		return pq.isEmpty()? null: pq.peek().item;
	}

	@Override
	public int getRank() {
		return pq.isEmpty()? 0: pq.peek().rank - normalizationOffset;
	}

}