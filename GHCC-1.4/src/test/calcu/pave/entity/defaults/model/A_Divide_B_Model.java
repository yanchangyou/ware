package test.calcu.pave.entity.defaults.model;

import test.calcu.pave.entity.abstracts.model.A_Op_B_Model;

public class A_Divide_B_Model extends A_Op_B_Model {

	public A_Divide_B_Model() {
		this.operatorSymbol = "/";
	}
	public void a_op_b() throws Exception {
		if (a % b != 0) {
			throw new Exception("不能整除");
		}
		result = a / b;
	}

	public void dealException(Exception e) {
		this.exceptionMessage = e.getMessage();
	}
	
}