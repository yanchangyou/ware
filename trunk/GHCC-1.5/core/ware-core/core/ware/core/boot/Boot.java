package ware.core.boot;

import java.net.MalformedURLException;

import ware.core.launch.Launcher;

public class Boot {

	public static void main(String[] args) throws MalformedURLException{
		
		Launcher launcher = new Launcher();
		
		try {
			launcher.launch(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
