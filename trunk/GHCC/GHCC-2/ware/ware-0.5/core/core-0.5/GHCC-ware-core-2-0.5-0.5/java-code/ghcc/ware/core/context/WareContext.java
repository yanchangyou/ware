package ghcc.ware.core.context;

import ghcc.ware.core.keywords.WareKeywordsDocument;
import ghcc.ware.core.node.WareElement;

import java.util.HashMap;
import java.util.Map;

import org.dom4j.Namespace;


/**
 * ware 上下文<br>
 * 现在不知道要什么, 暂时最简单处理<br>
 * @author yanchangyou
 * @version 1.0
 * @date 2010-10-4 20:29:50
 *
 */
public class WareContext {

	private Map<String, Object> param;
	
	private WareElement thisElement;
	
	private static Map<Namespace, WareKeywordsDocument> keywordsMap; 
	static {
		keywordsMap = new HashMap<Namespace, WareKeywordsDocument>();
	}
	
	public WareContext(Map<String, Object> param) {
		this.param = param;
	}
	
	public WareElement getThisElement() {
		return thisElement;
	}
	public Map<String, Object> getParam() {
		return param;
	}

	public void setThisElement(WareElement thisElement) {
		this.thisElement = thisElement;
	}

	public static Map<Namespace, WareKeywordsDocument> getKeywordsMap() {
		return keywordsMap;
	}
	
	public static WareKeywordsDocument getWareKeywordsDocument(Namespace namespace) {
		return keywordsMap.get(namespace);
	}
	
	public static void addWareKeywordsDocument(Namespace namespace, WareKeywordsDocument wareKeywordsDocument) {
		keywordsMap.put(namespace, wareKeywordsDocument);
	}

	public static void setKeywordsMap(
			Map<Namespace, WareKeywordsDocument> keywordsMap) {
		WareContext.keywordsMap = keywordsMap;
	}
}
