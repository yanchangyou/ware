package test.calcu.pave.concept;
/*=========================*\
step 1 : �������  a ����  b
\*=========================*/
public interface A_Op_B_Concept {
	/**
	 * a����b
	 * @return a����b��ֵ
	 * @throws Exception 
	 */
	void a_op_b() throws Exception;
	
	/**
	 * �����쳣
	 * @param e 
	 */
	void dealException(Exception e) throws Exception;
}