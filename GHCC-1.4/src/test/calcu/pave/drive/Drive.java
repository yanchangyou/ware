package test.calcu.pave.drive;

import java.io.IOException;

import test.calcu.pave.entity.defaults.view.A_Op_B_View;


/*=========================================*\
	step 3 安装驱动 ---驱动实体在计算机上运行
	
	把实体组织起来执行
\*=========================================*/
public class Drive {

	A_Op_B_View view;

	public Drive() throws IOException {
		view = new A_Op_B_View();
	}
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
