package ghcc.ware.core.util;

import ghcc.ware.core.context.WareContext;
import ghcc.ware.core.drive.Driver;
import ghcc.ware.core.exception.WareNoKeywordsFoundException;
import ghcc.ware.core.keywords.WareKeywordsDocument;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


public class KeywordsUtil {
	
	public static Driver getDriver(Element element) throws Exception {
		Namespace namespace = element.getNamespace();
		WareKeywordsDocument keywordsDocument = getWareKeywordsDocument(namespace);
		String tagName = element.getName();
		
		Node node = keywordsDocument.getRootElement().selectSingleNode("keyword[@name='" + tagName + "']");
		
		if (node == null) {
			throw new WareNoKeywordsFoundException("no such keyworld [" + tagName + "] in namespace [" + namespace.getURI() + "]");
		}
		
		ClassLoader classLoader = null;
		
		ClassLoader documentClassLoader = getWareKeywordsClassLoader(keywordsDocument);
		//class loader buffer need!!!
		Node classPathNode = node.selectSingleNode("@class-path");
		if (classPathNode != null) {
			String classPath = classPathNode.getText();
			classLoader = new URLClassLoader(new URL[]{new URL(classPath)}, documentClassLoader);
		} else {
			classLoader = documentClassLoader;
		}
		
		String className = node.selectSingleNode("@class-name").getText();
		Driver driver = (Driver)classLoader.loadClass(className).newInstance();
		return driver;
	}
	
	public static ClassLoader getWareKeywordsClassLoader(WareKeywordsDocument keywordsDocument) throws Exception {
		ClassLoader loader = keywordsDocument.getClassLoader();
		if (loader == null) {
			List<? extends Node> list = keywordsDocument.getRootElement().selectNodes("class-path-list/class-path");
			URL[] url = new URL[list.size()];
			for (int i = 0; i < url.length; i++) {
				Node node = (Node) list.get(i);
				url[i] = new URL(node.getText().trim());
			}
			loader = new URLClassLoader(url);
			keywordsDocument.setClassLoader(loader);
		} 
		return loader;
	}
	
	public static WareKeywordsDocument getWareKeywordsDocument(Namespace namespace) throws Exception {
		WareKeywordsDocument wareKeywordsDocument = WareContext.getWareKeywordsDocument(namespace);
		if (wareKeywordsDocument == null) {
			URL keywordsURL = new URL(namespace.getURI());
			Document keywordsDoc = new SAXReader().read(new InputStreamReader(keywordsURL .openStream()));
			wareKeywordsDocument = new WareKeywordsDocument(namespace);
			wareKeywordsDocument.setKeywordsDocument(keywordsDoc);
			WareContext.addWareKeywordsDocument(namespace, wareKeywordsDocument);
		}
		
		return wareKeywordsDocument;
	}
}
