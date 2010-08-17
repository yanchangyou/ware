package ware.lang.execute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Element;

public abstract class ExecuteNode {

	protected static List<String> classPackageList = new ArrayList<String>();
	static {
		classPackageList.add("ware.lang.execute.action");
		classPackageList.add("ware.lang.execute.flow");
	}
	@SuppressWarnings("unchecked")
	public static ExecuteNode createExecuteNode(String name) throws NoExecuteClassFoundException {
		for (Iterator<String> iterator = classPackageList.iterator(); iterator.hasNext();) {
			String packageName = iterator.next();
			try {
				Class clazz = Class.forName(packageName + "." + StringUtils.capitalize(name));
				ExecuteNode executeNode = (ware.lang.execute.ExecuteNode) clazz.newInstance();
				return executeNode;
			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		throw new NoExecuteClassFoundException(name);
	}
	
	protected Element dom4jElement;
	public Element getDom4jElement() {
		return dom4jElement;
	}

	public void setDom4jElement(Element dom4jElement) {
		this.dom4jElement = dom4jElement;
	}
	
	protected ExecuteNode() {
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, String> attributeToMap(Element dom4jElement) {
		Map<String, String> attributeMap = new HashMap<String, String>();
		List<Attribute> list = dom4jElement.attributes();
		for (Iterator<Attribute> iterator = list.iterator(); iterator.hasNext();) {
			Attribute attribute = (Attribute) iterator.next();
			attributeMap.put(attribute.getName(), attribute.getValue());
		}
		return attributeMap;
	}
	
	
	public void init(Element dom4jElement) throws NoExecuteClassFoundException {
		setDom4jElement(dom4jElement);
	}
	
	public abstract void execute() throws ExecuteExcepion;
}
