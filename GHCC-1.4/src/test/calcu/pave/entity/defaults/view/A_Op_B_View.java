package test.calcu.pave.entity.defaults.view;

import java.util.HashMap;
import java.util.Map;

import test.calcu.pave.concept.A_Op_B_Concept;
import test.calcu.pave.entity.abstracts.model.A_Op_B_Model;
import test.calcu.pave.entity.defaults.model.A_Add_B_Model;
import test.calcu.pave.entity.defaults.model.A_Divide_B_Model;
import test.calcu.pave.entity.defaults.model.A_Exponential_B_Model;
import test.calcu.pave.entity.defaults.model.A_Mod_B_Model;
import test.calcu.pave.entity.defaults.model.A_Multiply_B_Model;
import test.calcu.pave.entity.defaults.model.A_Subtract_B_Model;
import test.calcu.pave.util.Util;

public class A_Op_B_View implements A_Op_B_Concept {

	/**
	 * 视图可选用的实体模型 +、-、*、%/
	 */
	Map<String, A_Op_B_Model> opMap = new HashMap<String, A_Op_B_Model>();

	{
		A_Op_B_Model[] models = new A_Op_B_Model[]{
				new A_Add_B_Model(),
				new A_Subtract_B_Model(),
				new A_Multiply_B_Model(),
				new A_Divide_B_Model(),
				new A_Mod_B_Model(),
				new A_Exponential_B_Model()
		};
		for (int i = 0; i < models.length; i++) {
			opMap.put(models[i].getOperatorSymbol(), models[i]);
		}
	}

	
	A_Op_B_Model model; //视图使用一个模型
	
	public void readA() {
		int num = Util.readInt("a = ");
		model.setA(num);
	}

	public void readB() {
		int num = Util.readInt("b = ");
		model.setB(num);
	}

	public void readOp() throws Exception {
		String op = Util.readString("op = ");
		model = opMap.get(op);
		if (model == null) {
			throw new Exception("不识别的运算符[" + op + "]， 可以的运算符如下： " + opMap.keySet());
		}
	}
	
	/**
	 * 视图的计算， 依赖于模型的计算
	 * @throws Exception 
	 */
	public void a_op_b() throws Exception {
		readOp();
		
		readA();
		readB();
		
		try {
			model.a_op_b();
			showResult();
		} catch (Exception e) {
			dealException(e);
		}
	}
	
	public void showResult() {
		System.out.println("a " + model.getOperatorSymbol() + " b = " +
			"" + model.getA() + " " + model.getOperatorSymbol() + " " + model.getB() + " = " +
			"" + model.getResult());
	}

	public A_Op_B_Model getModel() {
		return model;
	}

	public void setModel(A_Op_B_Model model) {
		this.model = model;
	}
	
	public void showExceptionMessage() {
		System.out.println("*************ERROR************");
		System.out.println(this.model.getExceptionMessage());
		System.out.println("******************************");
	}
	
	public void dealException(Exception e) throws Exception {
		model.dealException(e);
		showExceptionMessage();
	}
}