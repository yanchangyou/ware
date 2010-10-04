package ware.core.boot;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import ware.core.launch.Launcher;

public class Boot {

	public static void main(String[] args) throws MalformedURLException{
		
		String launcherClassName = "ware.core.launch.Launcher";
		URL[] classPathURL = null;
		URL[] standardURL = null;
		URL[] userURL = null;
		URL[] localURL = null;
		
		try {
			standardURL = new URL[]{
					new URL("https://wareware.googlecode.com/svn/trunk/GHCC-1.5/core/ware-core/lib/ware.jar"),
					new URL("https://wareware.googlecode.com/svn/trunk/GHCC-1.5/core/ware-core/classes/"),
					new URL("https://wareware.googlecode.com/svn/trunk/GHCC-1.5/common/java-jar-lib/dom4j-2.0.0-ALPHA-2.jar"),
					new URL("https://wareware.googlecode.com/svn/trunk/GHCC-1.5/common/java-jar-lib/jaxen-1.1.3.jar"),
			};
			localURL = new URL[]{
					new URL("http://127.0.0.1:9999/ware-core/lib/ware.jar"),
					new URL("http://127.0.0.1:9999/ware-core/classes/"),
					new URL("http://127.0.0.1:9999/common/java-jar-lib/dom4j-2.0.0-ALPHA-2.jar"),
					new URL("http://127.0.0.1:9999/common/java-jar-lib/jaxen-1.1.3.jar"),
			};
			userURL = parseUserClassPath(args);
			
			if (userURL == null) {
				userURL = new URL[0];
			}
			classPathURL = new URL[standardURL.length + userURL.length + localURL.length];
			int classPathURLIndex = 0;
			for (int i = 0; i < standardURL.length; i++) {
				classPathURL[classPathURLIndex ++] = standardURL[i];
			}
			for (int i = 0; i < userURL.length; i++) {
				classPathURL[classPathURLIndex ++] = userURL[i];
			}
			for (int i = 0; i < localURL.length; i++) {
				classPathURL[classPathURLIndex ++] = localURL[i];
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return;
		}
		
		
		Launcher launcher = null;
		try {
			URLClassLoader loader = new URLClassLoader(classPathURL);
			Thread.currentThread().setContextClassLoader(loader);
			
			launcher = new Launcher();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			launcher.launch(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static URL[] parseUserClassPath(String args[]) throws MalformedURLException {
		URL[] classPathURL = null;
		if (args.length > 1) {
			
			if (args[0].startsWith("classpath=")
					||args[0].startsWith("CLASSPATH=")
					||args[0].startsWith("class-path=")
					||args[0].startsWith("CLASS-PATH=")
					||args[0].startsWith("cp=")
					||args[0].startsWith("CP=")) {
				
				String[] path = args[0].substring(args[0].indexOf('=')).split(";");
				classPathURL = new URL[path.length];
				for (int i = 0; i < path.length; i++) {
					classPathURL[i] = new URL(path[i]);
				}
			}
		}
		return classPathURL;
	}
}
