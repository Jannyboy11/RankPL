package com.tr.rp.exceptions;

import com.tr.rp.ast.AbstractExpression;

public class RPLTypeError extends RPLException {

	private final String expectedType;
	private final Object found;
	
	public RPLTypeError(String expectedType, Object found, AbstractExpression expression) {
		this.expectedType = expectedType;
		this.found = found;
		this.setExpression(expression);
	}
	
	public String getDescription() {
		return "Type error: expected " + expectedType + " but found " + found + ".";
	}

	public String getExpectedType() {
		return expectedType;
	}
	
	public String getFound() {
		return found.toString();
	}
	
}
