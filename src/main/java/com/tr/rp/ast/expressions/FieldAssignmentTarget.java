package com.tr.rp.ast.expressions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.tr.rp.ast.AbstractExpression;
import com.tr.rp.ast.LanguageElement;
import com.tr.rp.exceptions.RPLException;
import com.tr.rp.exceptions.RPLMiscException;
import com.tr.rp.varstore.VarStore;

public class FieldAssignmentTarget extends AbstractAssignmentTarget {
	
	private final String dictionary;
	private final String field;
	
	public FieldAssignmentTarget(String dictionary, String field) {
		this.dictionary = Objects.requireNonNull(dictionary);
		this.field = Objects.requireNonNull(field);
	}

	@Override
	public void getVariables(Set<String> list) {
		list.add(dictionary);
		list.add(field);
	}

	@Override
	public LanguageElement replaceVariable(String a, String b) {
		return new FieldAssignmentTarget(dictionary.equals(a) ? b : dictionary,
				field.equals(a) ? b : field);
	}

	@Override
	public boolean hasRankExpression() {
		return false;
	}

	@Override
	public AbstractExpression transformRankExpressions(VarStore v, int rank) throws RPLException {
		return this;
	}

	@Override
	public AbstractFunctionCall getEmbeddedFunctionCall() {
		return null;
	}

	@Override
	public AbstractExpression replaceEmbeddedFunctionCall(AbstractFunctionCall fc, String var) {
		return this;
	}

	@Override
	public Object getValue(VarStore e) throws RPLException {
		throw new RPLMiscException("Internal error: Attempt to evaluate left-hand side of assignment statement.");
	}

	@Override
	public boolean hasDefiniteValue() {
		return false;
	}

	@Override
	public Object getDefiniteValue() throws RPLException {
		throw new RPLMiscException("Internal error: Attempt to evaluate left-hand side of assignment statement.");
	}

	@Override
	public String toString() {
		return dictionary + "." + field;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof FieldAssignmentTarget)) return false;
		FieldAssignmentTarget that = (FieldAssignmentTarget) o;
		return Objects.equals(this.dictionary, that.dictionary) &&
				Objects.equals(this.field, that.field);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dictionary, field);
	}

	@Override
	public String getAssignedVariable() {
		return dictionary;
	}

	@Override
	public VarStore assign(VarStore vs, Object value) throws RPLException {
		Map<String, Object> mapValue = (Map) vs.getValue(dictionary);
		mapValue.put(field, new LinkedHashMap(mapValue));
		return vs.create(dictionary, mapValue); 
	}

}
