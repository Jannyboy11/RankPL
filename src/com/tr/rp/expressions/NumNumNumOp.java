package com.tr.rp.expressions;

import java.util.Set;
import java.util.function.BiFunction;

import com.tr.rp.core.Expression;
import com.tr.rp.core.LanguageElement;
import com.tr.rp.core.VarStore;
import com.tr.rp.exceptions.RPLException;

public class NumNumNumOp extends Expression {

	private final Expression e1, e2;
	private final BiFunction<Integer, Integer, Integer> f;
	
	public NumNumNumOp(BiFunction<Integer, Integer, Integer> f, Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.f = f;
	}
	@Override
	public boolean containsVariable(String var) {
		return e1.containsVariable(var) || e2.containsVariable(var);
	}

	@Override
	public void getVariables(Set<String> list) {
		e1.getVariables(list);
		e2.getVariables(list);
	}

	@Override
	public LanguageElement replaceVariable(String a, String b) {
		return new NumNumNumOp(f, (Expression)e1.replaceVariable(a, b), (Expression)e2.replaceVariable(a, b));
	}

	@Override
	public boolean hasRankExpression() {
		return e1.hasRankExpression() || e2.hasRankExpression();
	}

	@Override
	public Expression transformRankExpressions(VarStore v, int rank) throws RPLException {
		return new NumNumNumOp(f, (Expression)e1.transformRankExpressions(v, rank), (Expression)e2.transformRankExpressions(v, rank));
	}

	@Override
	public AbstractFunctionCall getEmbeddedFunctionCall() {
		AbstractFunctionCall fc = e1.getEmbeddedFunctionCall();
		if (fc != null) return fc;
		return e2.getEmbeddedFunctionCall();
	}

	@Override
	public Expression replaceEmbeddedFunctionCall(AbstractFunctionCall fc, String var) {
		return new NumNumNumOp(f, (Expression)e1.replaceEmbeddedFunctionCall(fc, var), (Expression)e2.replaceEmbeddedFunctionCall(fc, var));
	}

	@Override
	public Object getValue(VarStore e) throws RPLException {
		int o1 = e1.getIntValue(e);
		int o2 = e2.getIntValue(e);
		return f.apply(o1, o2);
	}
	@Override
	public boolean hasDefiniteValue() {
		return e1.hasDefiniteValue() && e2.hasDefiniteValue();
	}

	@Override
	public Object getDefiniteValue() throws RPLException {
		return f.apply((int)e1.getDefiniteValue(), (int)e2.getDefiniteValue());
	}
	
	public Expression getE1() {
		return e1;
	}

	public Expression getE2() {
		return e2;
	}
	
	public String toString() {
		return "(" + f.toString().replace("$1", e1.toString()).replace("$2", e2.toString()) + ")";
	}
	
	public boolean equals(Object o) {
		return (o instanceof NumNumNumOp) &&
				((NumNumNumOp)o).e1.equals(e1) &&
				((NumNumNumOp)o).e2.equals(e2) &&
				((NumNumNumOp)o).f == f;
	}
	
}
