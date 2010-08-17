package test.welcome;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.DocumentException;

import ware.lang.core.Ware;
import ware.lang.execute.NoExecuteClassFoundException;

public class Welcome {

	public static void main(String[] args) throws DocumentException, IOException, NoExecuteClassFoundException {
		wareShow();
	}
	
	public static void wareTest() {
		try {
			String wareXMLPath = "Welcome.ware.xml";
			Ware ware = new Ware(wareXMLPath);
			int port = 8811;
			ware.born(port);
			//born two to 8911
			ware.born(8911);
			//born three to 8011
			ware.born(8011);
			//使用线程变量存储, 特殊信息
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void wareShow() throws DocumentException, NoExecuteClassFoundException, IOException {
		int port = 8811;
		List<File> list = getAllWareFileList();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			File file = (File) iterator.next();
			Ware ware = new Ware(file);
			
			System.out.println("开始诞生: " + file.getName());
			
			ware.born();
		}
	}
	
	static Class clazz = Welcome.class;
	public static List<File> getAllWareFileList() {
		List<File> wareFileList = new ArrayList<File>();
		String dir = System.getProperty("user.dir");
		String wareXmlFilePath = dir + "\\classes\\test\\welcome";
		System.out.println(wareXmlFilePath);
		File wareDir = new File(wareXmlFilePath);
		File[] files = wareDir.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().endsWith(".xml")) {
				wareFileList.add(files[i]);
			}
		}
		return wareFileList;
	}
}
