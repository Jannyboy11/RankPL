package com.tr.rp.examples;

import static com.tr.rp.ast.expressions.Expressions.*;

import java.util.ArrayList;
import java.util.List;

import com.tr.rp.ast.AbstractExpression;
import com.tr.rp.ast.AbstractStatement;
import com.tr.rp.ast.ProgramBuilder;
import com.tr.rp.ast.expressions.Equals;
import com.tr.rp.ast.expressions.Expressions;
import com.tr.rp.ast.expressions.Literal;
import com.tr.rp.ast.expressions.Variable;
import com.tr.rp.ast.statements.Assign;
import com.tr.rp.ast.statements.IfElse;
import com.tr.rp.ast.statements.Observe;
import com.tr.rp.ast.statements.RankedChoice;
import com.tr.rp.exceptions.RPLException;
import com.tr.rp.iterators.ranked.InitialVarStoreIterator;
import com.tr.rp.iterators.ranked.MarginalizingIterator;
import com.tr.rp.iterators.ranked.RankedIterator;
import com.tr.rp.tools.ResultPrinter;
import com.tr.rp.varstore.VarStore;

/**
 * The circuit diagnosis example from the paper.
 */
public class BoolCircuit {

	public static final boolean F = false;
	public static final boolean T = true;
	
	public static AbstractStatement getProgram() {
		/* IF (fx1 == 0) THEN l1 := (a1 ^ a2) ELSE l1 := 0 << 0 >> 1;
		 * IF (fa1 == 0) THEN l2 := (a1 & a2) ELSE l2 := 0 << 0 >> 1;
		 * IF (fa2 == 0) THEN l3 := (l1 & a3) ELSE l3 := 0 << 0 >> 1;
		 * IF (fx2 == 0) THEN b2 := (l1 ^ a3) ELSE b2 := 0 << 0 >> 1;
		 * IF (fo2 == 0) THEN b1 := (l3 | l2) ELSE b1 := 0 << 0 >> 1;
		 */
		return new ProgramBuilder()
				.add(new RankedChoice(target("fx1"), lit(F), lit(T), lit(1)))
				.add(new RankedChoice(target("fx2"), lit(F), lit(T), lit(1)))
				.add(new RankedChoice(target("fa1"), lit(F), lit(T), lit(1)))
				.add(new RankedChoice(target("fa2"), lit(F), lit(T), lit(1)))
				.add(new RankedChoice(target("fo1"), lit(F), lit(T), lit(1)))
				.add(new RankedChoice(target("a1"),  lit(F), lit(T), lit(0)))
				.add(new RankedChoice(target("a2"),  lit(F), lit(T), lit(0)))
				.add(new RankedChoice(target("a3"),  lit(F), lit(T), lit(0)))
				.add(new IfElse(Expressions.not(new Variable("fx1")),
						new Assign("l1", Expressions.xor(new Variable("a1"), new Variable("a2"))),
						new RankedChoice(target("l1"), lit(F), lit(T), lit(0))))
				.add(new IfElse(Expressions.not(new Variable("fa1")),
						new Assign("l2", Expressions.and(new Variable("a1"), new Variable("a2"))),
						new RankedChoice(target("l2"), lit(F), lit(T), lit(0))))
				.add(new IfElse(Expressions.not(new Variable("fa2")),
						new Assign("l3", Expressions.and(new Variable("l1"), new Variable("a3"))),
						new RankedChoice(target("l3"), lit(F), lit(T), lit(0))))
				.add(new IfElse(Expressions.not(new Variable("fx2")),
						new Assign("b2", Expressions.xor(new Variable("l1"), new Variable("a3"))),
						new RankedChoice(target("b2"), lit(F), lit(T), lit(0))))
				.add(new IfElse(Expressions.not(new Variable("fo1")),
						new Assign("b1", Expressions.or(new Variable("l3"), new Variable("l2"))),
						new RankedChoice(target("b1"), lit(F), lit(T), lit(0))))
				.add(new Observe(getCondition(F,F,T,T,F)))
				.build();
	}
	
	private static AbstractExpression getCondition(boolean a1, boolean a2, boolean a3, boolean b1, boolean b2) {
		AbstractExpression r = Expressions.and(Expressions.eq(new Variable("a1"), new Literal<Boolean>(a1)), 
				Expressions.eq(new Variable("a2"), new Literal<Boolean>(a2)));
		r = Expressions.and(r, Expressions.eq(new Variable("a3"), new Literal<Boolean>(a3)));
		r = Expressions.and(r, Expressions.eq(new Variable("b1"), new Literal<Boolean>(b1)));
		r = Expressions.and(r, Expressions.eq(new Variable("b2"), new Literal<Boolean>(b2)));
		return r;
	}

	public static void main(String[] args) throws RPLException {

		AbstractStatement circuit = getProgram();
		
		RankedIterator<VarStore> it = circuit.getIterator(new InitialVarStoreIterator(), null);
		List<String> vars = new ArrayList<String>();
		vars.add("fx1"); vars.add("fx2"); vars.add("fa1"); vars.add("fa2"); vars.add("fo1");
//		RankedIterator<VarStore> m = new MarginalizingIterator(it, vars);
		ResultPrinter.print(it, 3);

	}
	
}
