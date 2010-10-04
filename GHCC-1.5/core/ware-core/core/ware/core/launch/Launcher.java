package ware.core.launch;

import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import ware.lang.Execute;

public class Launcher {

	public void launch(String[] args) throws Exception {
		
		if (args == null || args.length == 0) {
			throw new NullPointerException("param can't be null");
		}
		
		WareParam wareParam = new WareParam(args[0]);
		String wareXMLPath = wareParam.getWarePath();
		System.out.println(wareXMLPath);
		
		Document codeDoc = null;
		SAXReader saxReader = new SAXReader();
		File wareFile = new File(wareXMLPath);
		if (wareFile.exists()) {
			codeDoc = saxReader.read(wareFile);
		} else {
			URL url = new URL(wareXMLPath);
			codeDoc = saxReader.read(new InputStreamReader(url.openStream()));
		}
		
		System.out.println(codeDoc.asXML());
		Namespace namespace = codeDoc.getRootElement().getNamespace();
		System.out.println("namespace.getPath() : " + namespace.getURI());
		URL keywordsURL = new URL(namespace.getURI());

		Document keywordsDoc = saxReader.read(new InputStreamReader(keywordsURL.openStream()));
		System.out.println(keywordsDoc.asXML());
		
		Node keywordsRoot = keywordsDoc.getRootElement();
		
		Map<String,Object> context = new HashMap<String,Object>();
		
		Element wareRoot = codeDoc.getRootElement();

		execute(keywordsRoot, context, wareRoot);
	}

	private void execute(Node keywordsRoot, Map<String, Object> context,
			Element element) throws MalformedURLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		String tagName = element.getName();
		
		//tag-name -> class and class-path
		Node node = keywordsRoot.selectSingleNode("keyword[@name='" + tagName + "']");
		System.out.println(node.asXML());
		
		String className = node.selectSingleNode("@class").getText();
		String classPath = node.selectSingleNode("@class-path").getText();
		
		URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL(classPath)});
		Execute execute = (Execute)urlClassLoader.loadClass(className).newInstance();
//		execute.execute(); //@Deprecated
		context.put("this", element);
		execute.execute(context);
		
		for (Iterator<Element> it = element.elementIterator(); it.hasNext();) {
			Element childElement = it.next();
			context.put("this", childElement);
			execute(keywordsRoot, context, childElement);
		}
	}
}
