package ware.core.boot;

import ware.core.launch.Launcher;

public class Boot {

	public static void main(String[] args) {
		
		Launcher launcher = new Launcher();
		
		try {
			launcher.launch(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
