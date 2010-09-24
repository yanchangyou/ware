package test.calcu.pioneer.version1.process;

import java.util.Scanner;

//面向过程编程demo--a+b


class A_Add_B_View {

	public int readA() {
		int num = Util.readInt("a = ");
		return num;
	}

	public int readB() {
		int num = Util.readInt("b = ");
		return num;
	}

	public void showResult(int result) {
		System.out.println("a + b = " + result);
	}
}

class A_Add_B_Model {

	int a;
	int b;
	int result;
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

	public void a_add_b() {
		this.result = a + b;
	}
}

public class Drive {
	
	A_Add_B_Model model = new A_Add_B_Model();
	A_Add_B_View view = new A_Add_B_View();
	
	public void drive() {
		for (int i=0; i<10; i++) {
			System.out.println("=============================");
			
			int a = view.readA();
			model.setA(a);
			
			int b = view.readB();
			model.setB(b);
			
			model.a_add_b();
			
			view.showResult(model.getResult());
		}
	}
	
	public static void main(String[] args) {
		Drive drive = new Drive();
		drive.drive();
	}
}


/**
 * 工具类
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
