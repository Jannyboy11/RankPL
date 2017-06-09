package com.tr.rp.ast.expressions;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.tr.rp.ast.AbstractExpression;
import com.tr.rp.exceptions.RPLException;
import com.tr.rp.varstore.VarStore;

public class FieldExpression extends AbstractExpression {
	
	private final AbstractExpression dictNameExpr;
	private final AbstractExpression fieldNameExpr;
	
	public FieldExpression(AbstractExpression dictExpr, AbstractExpression fieldExpr) {
		this.dictNameExpr = Objects.requireNonNull(dictExpr);
		this.fieldNameExpr = Objects.requireNonNull(fieldExpr);
	}
	
	@Override
	public void getVariables(Set<String> list) {
		fieldNameExpr.getVariables(list);
		dictNameExpr.getVariables(list);
	}
	
	@Override
	public FieldExpression replaceVariable(String a, String b) {
		return new FieldExpression((AbstractExpression) dictNameExpr.replaceVariable(a, b),
				(AbstractExpression) fieldNameExpr.replaceVariable(a, b));
	}
	
	@Override
	public boolean hasRankExpression() {
		return dictNameExpr.hasRankExpression() || fieldNameExpr.hasRankExpression();
	}
	
	@Override
	public AbstractExpression transformRankExpressions(VarStore v, int rank) throws RPLException {
		return new FieldExpression(dictNameExpr.transformRankExpressions(v, rank),
				fieldNameExpr.transformRankExpressions(v, rank));
	}
	
	@Override
	public AbstractFunctionCall getEmbeddedFunctionCall() {
		AbstractFunctionCall dctCall = dictNameExpr.getEmbeddedFunctionCall();
		return dctCall == null ? fieldNameExpr.getEmbeddedFunctionCall() : dctCall;
	}
	
	@Override
	public AbstractExpression replaceEmbeddedFunctionCall(AbstractFunctionCall fc, String var) {
		return new FieldExpression(dictNameExpr.replaceEmbeddedFunctionCall(fc, var),
				fieldNameExpr.replaceEmbeddedFunctionCall(fc, var));
	}
	
	@Override
	public Object getValue(VarStore e) throws RPLException {
		String dictName = dictNameExpr.getStringValue(e);
		String fieldName = fieldNameExpr.getStringValue(e);
		
		//TODO throw a type error?
		Map<String, Object> fields = (Map<String, Object>) e.getValue(dictName);
		if (fields == null) return null;
		
		return fields.get(fieldName);
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
				Objects.equals(this.fieldNameExpr, that.fieldNameExpr);
	}
	@Override
	public int hashCode() {
		return Objects.hash(dictNameExpr, fieldNameExpr);
	}
	
}
