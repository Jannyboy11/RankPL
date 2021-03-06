package com.tr.rp.iterators.ranked;

import java.util.Arrays;
import java.util.List;

import com.tr.rp.exceptions.RPLException;
import com.tr.rp.varstore.VarStore;

/**
 * A ranked iterator that takes another ranked iterator as input,
 * and yields a marginalization of this iterator to a given set of 
 * variables.
 */
public class MarginalizingIterator extends DuplicateRemovingIterator<VarStore> {
	
	public MarginalizingIterator(RankedIterator<VarStore> in, String ... vars) {
		this(in, Arrays.asList(vars));
	}
	
	public MarginalizingIterator(final RankedIterator<VarStore> in, final List<String> vars) {
		super(new RankedIterator<VarStore>() {
			@Override
			public boolean next() throws RPLException {
				return in.next();
			}

			@Override
			public VarStore getItem() throws RPLException {
				if (in == null) return null;
				VarStore v = in.getItem();
				if (v == null) return null;
				return v.marginalize(vars);
			}

			@Override
			public int getRank() {
				return in == null? 0: in.getRank();
			}
		});
	}
}
