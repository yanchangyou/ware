package test.calcu.pave.util.copy;

import java.util.Scanner;

/**
 * ������
 * @author yanchangyou
 *
 */
public class Util {
	public static int readInt(String msg) {
		System.out.print(msg);
		int result = -1;
		Scanner scanner = new Scanner(System.in);
		try {
			result = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("��������������д����");
			result = readInt(msg);
		}
		return result;
	}

	public static String readString(String msg) {
		System.out.print(msg);
		String result = null;
		Scanner scanner = new Scanner(System.in);
		result = scanner.nextLine();
		return result;
	}
}