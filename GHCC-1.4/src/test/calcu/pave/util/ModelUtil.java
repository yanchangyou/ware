package test.calcu.pave.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import test.calcu.pave.entity.abstracts.model.A_Op_B_Model;

public class ModelUtil<T> {

	public static List<A_Op_B_Model> readAllModelByPackageName(String packageName) throws IOException {
		if (packageName == null) {
			throw new NullPointerException("packageName param is null");
		}
		List<A_Op_B_Model> modelList = new ArrayList<A_Op_B_Model>();
		
		Set<String> allClassNameSet = getAllClassNameSet(packageName);
		
		for (Iterator<String> it = allClassNameSet.iterator(); it.hasNext();) {
			String className = (String) it.next();
			A_Op_B_Model model = null;
			try {
				model = (A_Op_B_Model) Class.forName(className).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			modelList.add(model);
			
		}
		return modelList;
	}
	
	public static <T> List<Class<T>> getAllClassFromPackage(String packageName) throws IOException, ClassNotFoundException {
		List<Class<T>> classList = new ArrayList<Class<T>>();
		Set<String> allClassNameSet = getAllClassNameSet(packageName);
		for (Iterator<String> it = allClassNameSet.iterator(); it.hasNext();) {
			String className = it.next();
			classList.add((Class<T>) Class.forName(className));
		}
		return classList;
	}
	public static Set<String> getAllClassNameSet(String packageName) throws IOException {
		Set<String> allClassNameSet = new HashSet<String>();
		String resouceName = packageName.replace('.', '/');
		Enumeration<URL> _enum = Thread.currentThread().getContextClassLoader().getResources(resouceName);
		while (_enum.hasMoreElements()) {
			URL url = _enum.nextElement();
			List<String> allFileNameList= getAllSimpleClassNameList(url);
			for (Iterator<String> it = allFileNameList.iterator(); it.hasNext();) {
				String simpleClassName = (String) it.next();
				String className = packageName + "." + simpleClassName;
				allClassNameSet.add(className);
			}
		}
		return allClassNameSet;
	}
	
	public static List<String> getAllSimpleClassNameList(URL url) throws IOException {
		List<String> allFileNameList= getAllFileNameList(url);
		for (int i = 0; i < allFileNameList.size(); i++) {
			String fileName = allFileNameList.get(i);
			allFileNameList.set(i, fileName.substring(0, fileName.indexOf('.')));
		}
		return allFileNameList;
	}
	
	public static List<String> getAllFileNameList(URL url) throws IOException {
		
		List<String> fileURLList = new ArrayList<String>();
		if (url.getProtocol().toLowerCase().indexOf("jar") != -1) {
			fileURLList = getAllFileNameListFromJar(url);
		} else {
			fileURLList = getAllFileNameListFromFile(url);
		}
		return fileURLList;
	}

	public static List<String> getAllFileNameListFromFile(URL url) throws IOException {
		List<String> fileURLList = new ArrayList<String>();
		InputStream in = url.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String fileName = reader.readLine();
		while (fileName != null) {
			if (fileName.indexOf(".class") != -1) { //只提前类文件
				fileURLList.add(fileName);
			}
			fileName = reader.readLine();
		}
		in.close();
		return fileURLList;
	}
	
	public static List<String> getAllFileNameListFromJar(URL url) throws IOException {
		List<String> fileURLList = new ArrayList<String>();
		JarURLConnection conn = (JarURLConnection) url.openConnection();
		JarEntry jarEntry = conn.getJarEntry();
		String baseJarEntryName = jarEntry.getName();
		JarFile jarFile = conn.getJarFile();
		Enumeration<JarEntry> en = jarFile.entries();

		while (en.hasMoreElements()) { 
			jarEntry = en.nextElement();
//			System.out.println(jarEntry);
			String jarEntryName = jarEntry.getName();
			if (jarEntryName.indexOf(baseJarEntryName) != -1 && jarEntryName.indexOf(".class") != -1) {
				String className = jarEntryName.substring(jarEntryName.lastIndexOf('/')+1);
//				System.out.println(className);
				fileURLList.add(className);
			}
		} 
		return fileURLList;
	}
	
	public static void main(String[] args) throws Exception {
		String packageName = "test.calcu.test";
		List<A_Op_B_Model> modelList = ModelUtil.readAllModelByPackageName(packageName);
		System.out.println(modelList);
//		
//
//		String anchorClassName = "test.calcu.test.ModelAnchor";
//		Class anchorClass = Class.forName(anchorClassName);
//		Set<String> classNameList = getAllClassNameSetByAnchorClass(anchorClass);
//		System.out.println(classNameList);
//		urlTest();
		
//		jarTest();
	}

	public static void urlTest() throws MalformedURLException, IOException {
		URL url = new URL("file:/E:/projects/dev/workspace%203.6-2/GHCC-1.4/bin/test%5ccalcu%5cpave%5centity%5cdefaults%5cmodel");
		
		InputStream in = url.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String str = reader.readLine();
		while (str != null) {
			System.out.println(str);
			System.out.println(new URL(url, str));
			str = reader.readLine();
		}
	}
	public static void jarTest() throws MalformedURLException, IOException {
		URL url = new URL("jar:file:/E:/projects/dev/workspace%203.6-2/GHCC-1.4/lib/model.jar!/test/calcu/test/");
		
		JarURLConnection conn = (JarURLConnection) url.openConnection();//.openStream();
		JarEntry jarEntry = conn.getJarEntry();
		String baseJarEntryName = jarEntry.getName();
//		JarInputStream in = new JarInputStream(jarEntry);
//		jarEntry.get
		JarFile jarFile = conn.getJarFile();
//		conn.get
//		System.out.println(conn.getJarEntry());
//		System.out.println(jarEntry.isDirectory());
//		System.out.println(jarEntry.getSize());
//		;
//		String path = url.getPath();
//		String filePrefix = "file:/";
//		path = path.substring(path.indexOf(filePrefix) + filePrefix.length());
//		path = path.substring(0, path.indexOf('!'));
//		path = URLDecoder.decode(path, "UTF-8");
//		JarFile jarFile = new JarFile(path);
		Enumeration<JarEntry> en = jarFile.entries();

		while (en.hasMoreElements()) { 
			jarEntry = en.nextElement();
			System.out.println(jarEntry);
			String jarEntryName = jarEntry.getName();
			if (jarEntryName.indexOf(baseJarEntryName) != -1 && jarEntryName.indexOf(".class") != -1) {
				System.out.println(jarEntryName.substring(jarEntryName.lastIndexOf('/')+1, jarEntryName.lastIndexOf('.')));
			}
		} 
//		System.out.println(file);
//		InputStream input = jarEntry.getInputStream(jarEntry); 
//		JarURLConnection.JarURLInputStream jarIn = in;
////		if(in.available() > 0){
////			
////			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
////			String str = reader.readLine();
////			while (str != null) {
////				System.out.println(str);
////				System.out.println(new URL(url, str));
////				str = reader.readLine();
////			}
////		}
//		java.util.zip.ZipInputStream zis   =  new java.util.zip.ZipInputStream(in);
//		java.util.zip.ZipEntry ze=null; 
//		while((ze=zis.getNextEntry())!=null){ 
//			if(ze.isDirectory()){ 
//				continue; 
//			} 
//			System.out.println( "ze.getName()= "+ze.getName()+ ", "+ "getSize()= "+ze.getSize() 
//			); 
//		}
//        JarEntry   e   =   null;   
//        System.out.println(jis.getManifest());
//        while   ((e   =   jis.getNextJarEntry())   !=   null)   {    
//                String   eName   =   e.getName();    
//               System.out.println(eName);
//                jis.closeEntry();    
//        }    
//        jis.close();    
		
	}
	
}
