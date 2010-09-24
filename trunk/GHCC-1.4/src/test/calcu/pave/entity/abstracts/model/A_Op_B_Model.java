package test.calcu.pave.entity.abstracts.model;

import test.calcu.pave.concept.A_Op_B_Concept;

/**
 *模型实体
 */
public abstract class A_Op_B_Model implements A_Op_B_Concept {

	protected String operatorSymbol;
	
	protected int a;
	protected int b;
	protected int result;
	
	protected String exceptionMessage;
	
	public String getOperatorSymbol() {
		return operatorSymbol;
	}

	public void setOperatorSymbol(String operatorSymbol) {
		this.operatorSymbol = operatorSymbol;
	}


	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getExceptionMessage() {
		return this.exceptionMessage;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public abstract void a_op_b() throws Exception;
}