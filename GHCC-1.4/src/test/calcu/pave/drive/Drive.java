package test.calcu.pave.drive;

import test.calcu.pave.entity.defaults.view.A_Op_B_View;


/*=========================================*\
	step 3 ��װ���� ---����ʵ���ڼ����������
	
	��ʵ����֯����ִ��
\*=========================================*/
public class Drive {

	A_Op_B_View view = new A_Op_B_View();

	public void drive() {
		for (int i=0; ; i++) {
			System.out.println("=============================");
			try {	
				view.a_op_b();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}
