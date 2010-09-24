package test.calcu.pave.entity.defaults.model;

import test.calcu.pave.entity.abstracts.model.A_Op_B_Model;

public class A_Mod_B_Model extends A_Op_B_Model {

	public A_Mod_B_Model() {
		this.operatorSymbol = "%";
	}
	public void a_op_b() throws Exception {
		if (b == 0) {
			throw new Exception("b不能为零");
		}
		result = a % b;
	}

	public void dealException(Exception e) {
		this.exceptionMessage = e.getMessage();
	}
}