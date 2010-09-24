package test.calcu.pave.concept;
/*=========================*\
step 1 : 提出概念  a 运算  b
\*=========================*/
public interface A_Op_B_Concept {
	/**
	 * a运算b
	 * @return a运算b的值
	 * @throws Exception 
	 */
	void a_op_b() throws Exception;
	
	/**
	 * 处理异常
	 * @param e 
	 */
	void dealException(Exception e) throws Exception;
}