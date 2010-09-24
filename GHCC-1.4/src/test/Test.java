package test;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
//		hello();
		mvc();
		
	}
	
	public static void hello() {
		System.out.println("hello world!");
	}
	
	public static void mvc() {
		View view = new View();
		
		Model model = new Model();
		
		int a = view.readA();
		int b = view.readB();
		
		
		int c = model.add(a, b);
		
		view.showResult(c);
	}
	
}


class View {
	public int readA() {
		return readInt();
	}
	public int readB() {
		return readInt();
	}
	
//	public int add() {
//		
//	}
	
	public void showResult(int result) {
		System.out.println("result is " + result);
	}
	
	public int readInt() {
		int result = -1;
//		DataInputStream in = new DataInputStream(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.print("input : ");
		result = scanner.nextInt();
		System.out.println("your input is : " + result);
		return result;
	}
}

class Model {
	int a;
	int b;
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub() {
		return a - b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}

class Controllor {
	
}