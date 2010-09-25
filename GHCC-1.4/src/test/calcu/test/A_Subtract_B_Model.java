package test.calcu.test;

import test.calcu.pave.entity.abstracts.model.A_Op_B_Model;

public class A_Subtract_B_Model extends A_Op_B_Model {

	public A_Subtract_B_Model() {
		this.operatorSymbol = "-";
	}
	public void a_op_b() {
		result = a - b;
	}

	public void dealException(Exception e) {
		this.exceptionMessage = "不可能发生";
	}
}