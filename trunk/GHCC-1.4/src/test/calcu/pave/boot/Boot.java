package test.calcu.pave.boot;

import java.io.IOException;

import test.calcu.pave.drive.Drive;

public class Boot {
	public static void main(String[] args) throws IOException {
		Drive drive = new Drive();
		drive.drive();
	}
}
