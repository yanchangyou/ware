package util;

import java.io.File;


public class Util {

	public static void main(String[] args) {
		
		String path = "E:\\projects\\dev\\my\\GHCC-1\\code\\ware\\lang\\impl\\ether";
		String prefix = "Ether$";
		String subfix = "";
		
		File dir = new File(path);
		
		rename(dir, prefix, subfix);
	}
	
	public static void rename(File file, String prefix, String subfix) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				rename(files[i], prefix, subfix);
			}
		} else {
			file.renameTo(new File(file.getParent()+File.separator+prefix + file.getName() + subfix));
		}
	}
}
