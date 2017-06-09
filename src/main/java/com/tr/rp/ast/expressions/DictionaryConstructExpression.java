package com.tr.rp.ast.expressions;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.tr.rp.ast.AbstractExpression;
import com.tr.rp.ast.LanguageElement;
import com.tr.rp.exceptions.RPLException;
import com.tr.rp.varstore.VarStore;

public class DictionaryConstructExpression extends AbstractExpression {
	
	private final LinkedHashMap<String, AbstractExpression> fields;
	
	public DictionaryConstructExpression() {
		this.fields = new LinkedHashMap<>();
	}
	
	public DictionaryConstructExpression(LinkedHashMap<String, AbstractExpression> fields) {
		this.fields = new LinkedHashMap<>(Objects.requireNonNull(fields));
	}

	public DictionaryConstructExpression transformRankExpressions(VarStore v, int rank) throws RPLException {
		if (fields.keySet().stream().anyMatch(key -> v.containsVar(key))) {
			DictionaryConstructExpression that = new DictionaryConstructExpression();
			that.fields.putAll(this.fields);

			for (String key : this.fields.keySet()) {
				AbstractExpression transformed = that.fields.get(key).transformRankExpressions(v,  rank);
				that.fields.put(key, transformed);
			}
			
			return that;
		} else {
			return this;
		}
	}

	@Override
	public void getVariables(Set<String> list) {
		fields.values().stream().forEach(e -> e.getVariables(list));
	}

	@Override
	public LanguageElement replaceVariable(String a, String b) {
		//TODO do I also need to replace the field names? I don't think so?

		DictionaryConstructExpression that = new DictionaryConstructExpression();
		that.fields.putAll(this.fields);

		for (String key : this.fields.keySet()) {
			AbstractExpression transformed = (AbstractExpression) that.fields.get(key).replaceVariable(a, b);
			that.fields.put(key, transformed);
		}
		
		return that;
	}

	@Override
	public boolean hasRankExpression() {
		return fields.values().stream().anyMatch(AbstractExpression::hasRankExpression);
	}

	@Override
	public AbstractFunctionCall getEmbeddedFunctionCall() {
		return fields.values().stream()
				.map(AbstractExpression::getEmbeddedFunctionCall)
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}

	@Override
	public AbstractExpression replaceEmbeddedFunctionCall(AbstractFunctionCall fc, String var) {
		DictionaryConstructExpression dct = new DictionaryConstructExpression();
		this.fields.forEach((key, value) -> dct.putExpression(key, value.replaceEmbeddedFunctionCall(fc, var)));
		return dct;
	}

	@Override
	public Object getValue(VarStore e) throws RPLException {
		LinkedHashMap<String, Object> thatFields = new LinkedHashMap<>();
		for (Entry<String, AbstractExpression> entry : fields.entrySet()) {
			String key = entry.getKey();
			AbstractExpression value = entry.getValue();
			thatFields.put(key, value.getValue(e));
		}
		return thatFields;
	}

	@Override
	public boolean hasDefiniteValue() {
		return fields.values().stream().allMatch(AbstractExpression::hasDefiniteValue);
	}

	@Override
	public LinkedHashMap<String, AbstractExpression> getDefiniteValue() throws RPLException {
		return new LinkedHashMap<>(fields);
	}
	
	

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof DictionaryConstructExpression)) return false;
		DictionaryConstructExpression that = (DictionaryConstructExpression) o;
		return Objects.equals(this.fields, that.fields);		
	}

	@Override
	public int hashCode() {
		return fields.hashCode();
	}
	

	
	public void putExpression(String key, AbstractExpression value) {
		this.fields.put(key, value);
	}
	
	public AbstractExpression getExpression(String field) {
		return fields.get(field);
	}

}
