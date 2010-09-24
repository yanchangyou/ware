package test.calcu.pioneer.version1;

import java.util.Scanner;

//���������demo--a+b

/*=========================*\
  step 1 : �������  a + b
\*=========================*/

interface A_Add_B_Concept {
	/**
	 * a + b
	 * @return a+b��ֵ
	 */
	int a_add_b();
}

/*==============================*\
	step 2 ����ʵ�� ---���廯����
	
	һ���������ʵ�壺��ͼ��ģ��
	2.1, ģ��ʵ��
	2.2, ��ͼʵ��, ������ģ��ʵ��
\*==============================*/

class A_Add_B_View implements A_Add_B_Concept {

	A_Add_B_Model model; //��ͼ������ģ��
	
	A_Add_B_View(A_Add_B_Model model) {
		this.model = model;
	}
	
	public void readA() {
		int num = Util.readInt("a = ");
		model.setA(num);
//		a_add_b();
	}

	public void readB() {
		int num = Util.readInt("b = ");
		model.setB(num);
//		a_add_b();
	}

	/**
	 * ��ͼ�ļ��㣬 ������ģ�͵ļ���
	 */
	public int a_add_b() {
		int result = model.a_add_b();
		System.out.println("a + b = " + model.getA() + " + " + model.getB() + " = " + result);
		return result;
	}
}

class A_Add_B_Model implements A_Add_B_Concept {

	int a;
	int b;
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

	public int a_add_b() {
		return a + b;
	}
}


/*=========================================*\
	step 3 ��װ���� ---����ʵ���ڼ����������
	
	��ʵ����֯����ִ��
\*=========================================*/
public class Drive {
	
	A_Add_B_Model model = new A_Add_B_Model();
	A_Add_B_View view = new A_Add_B_View(model);
	
	public void drive() {
		for (int i=0; i<10; i++) {
			System.out.println("=============================");
			view.readA();
			view.readB();
			view.a_add_b();
		}
	}
	
	public static void main(String[] args) {
		Drive drive = new Drive();
		drive.drive();
	}
}


/**
 * ������
 * @author yanchangyou
 *
 */
class Util {
	public static int readInt(String msg) {
		System.out.print(msg);
		int result = -1;
		Scanner scanner = new Scanner(System.in);
		result = scanner.nextInt();
		return result;
	}
}
