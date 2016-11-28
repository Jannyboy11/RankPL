package com.tr.rp.denotational.expressions.bool;

import com.tr.rp.denotational.core.DExpression;
import com.tr.rp.denotational.core.VarStore;
import com.tr.rp.denotational.expressions.num.IntLiteral;
import com.tr.rp.denotational.expressions.num.Var;

public class Equals extends BoolExp {

	public final DExpression e1, e2;

	public Equals(DExpression e1, DExpression e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public Equals(DExpression e, String var) {
		this(e, new Var(var));
	}
	
	public Equals(String var, DExpression e) {
		this(new Var(var), e);
	}
	
	public Equals(DExpression e, int val) {
		this(e, new IntLiteral(val));
	}
	
	public Equals(int val, DExpression e) {
		this(new IntLiteral(val), e);
	}
	
	public Equals(String var1, String var2) {
		this(new Var(var1), new Var(var2));
	}
	
	public Equals(String var, int val) {
		this(new Var(var), new IntLiteral(val));
	}
	
	public Equals(int val, String var) {
		this(new IntLiteral(val), new Var(var));
	}
	
	@Override
	public boolean isTrue(VarStore e) {
		return e1.getVal(e) == e2.getVal(e);
	}

}
