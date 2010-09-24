package test.calcu.pave.util.copy;

import java.util.Scanner;

/**
 * 工具类
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
			System.out.println("输入整数错误，重写输入");
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