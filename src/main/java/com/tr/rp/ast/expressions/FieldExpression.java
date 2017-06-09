package com.tr.rp.ast.expressions;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.tr.rp.ast.AbstractExpression;
import com.tr.rp.exceptions.RPLException;
import com.tr.rp.varstore.VarStore;

public class FieldExpression extends AbstractExpression {
	
	private final AbstractExpression dictNameExpr;
	private final String field; //TODO this should be a String instead?
	
	public FieldExpression(AbstractExpression dictExpr, String field) {
		this.dictNameExpr = Objects.requireNonNull(dictExpr);
		this.field = Objects.requireNonNull(field);
	}
	
	@Override
	public void getVariables(Set<String> list) {
		dictNameExpr.getVariables(list);
		//TODO do something with the field or nah?
		list.add(field);
	}
	
	@Override
	public FieldExpression replaceVariable(String a, String b) {
		return new FieldExpression((AbstractExpression) dictNameExpr.replaceVariable(a, b), field.equals(a) ? b : field);
	}
	
	@Override
	public boolean hasRankExpression() {
		return dictNameExpr.hasRankExpression();
	}
	
	@Override
	public AbstractExpression transformRankExpressions(VarStore v, int rank) throws RPLException {
		return new FieldExpression(dictNameExpr.transformRankExpressions(v, rank), field);
	}
	
	@Override
	public AbstractFunctionCall getEmbeddedFunctionCall() {
		AbstractFunctionCall dctCall = dictNameExpr.getEmbeddedFunctionCall();
		return dctCall;
	}
	
	@Override
	public AbstractExpression replaceEmbeddedFunctionCall(AbstractFunctionCall fc, String var) {
		return new FieldExpression(dictNameExpr.replaceEmbeddedFunctionCall(fc, var), field);
	}
	
	@Override
	public Object getValue(VarStore e) throws RPLException {
		String dictName = dictNameExpr.getStringValue(e);
		
		//TODO throw a type error?
		Map<String, Object> fields = (Map<String, Object>) e.getValue(dictName);
		if (fields == null) return null;
		
		return fields.get(field);
	}
	
	@Override
	public boolean hasDefiniteValue() {
		return false;
	}
	
	@Override
	public Object getDefiniteValue() throws RPLException {
		return null;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof FieldExpression)) return false;
		FieldExpression that = (FieldExpression) o;
		return Objects.equals(this.dictNameExpr, that.dictNameExpr) &&
				Objects.equals(this.field, that.field);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dictNameExpr, field);
	}
	
	@Override
	public String toString() {
		return "FieldExpression{dictionary=" + dictNameExpr + ", field=" + field + "}";
	}
	
}
