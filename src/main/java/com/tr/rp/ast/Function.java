package com.tr.rp.ast;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Function implements LanguageElement {

	private final String name;
	private AbstractStatement body;
	private final String[] parameters;
	private int lineNumber = -1;
	
	public Function(String name, AbstractStatement body, String ... parameters) {
		this.name = name;
		this.body = body;
		this.parameters = parameters;
	}

	public Function(String name, String ... parameters) {
		this.name = name;
		this.parameters = parameters;
	}

	public void setBody(AbstractStatement body) {
		this.body = body;
	}
	
	public AbstractStatement getBody() {
		return body;
	}

	public String[] getParameters() {
		return parameters;
	}

	public String getName() {
		return name;
	}

	@Override
	public void getVariables(Set<String> list) {
		throw new UnsupportedOperationException();
	}

	@Override
	public LanguageElement replaceVariable(String a, String b) {
		throw new UnsupportedOperationException();
	}

	public boolean equals(Object o) {
		if (o instanceof Function) {
			Function f = (Function)o;
			return f.name.equals(name) &&
					f.body.equals(body) &&
					Arrays.equals(f.parameters, parameters);
		}
		return false;
	}
	
	public String toString() {
		return name + "(" + (Arrays.stream(parameters).collect(Collectors.joining(", "))) + ")" +
					" {" + body + "}";
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public int getLineNumber() {
		return lineNumber;
	}
}
