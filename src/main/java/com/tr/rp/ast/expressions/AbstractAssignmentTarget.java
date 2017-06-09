package com.tr.rp.ast.expressions;

import com.tr.rp.ast.AbstractExpression;
import com.tr.rp.exceptions.RPLException;
import com.tr.rp.varstore.VarStore;

public abstract class AbstractAssignmentTarget extends AbstractExpression {

	public abstract String getAssignedVariable();

	public abstract VarStore assign(VarStore vs, Object value) throws RPLException;

}
