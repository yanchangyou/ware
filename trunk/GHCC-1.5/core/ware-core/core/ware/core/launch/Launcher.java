package ware.core.launch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Element;
import org.dom4j.Node;

import ware.core.context.WareContext;
import ware.core.drive.Driver;
import ware.core.exception.WareException;
import ware.core.node.WareDocument;
import ware.core.node.WareElement;
import ware.core.util.KeywordsUtil;

public class Launcher {

	public void launch(String[] args) throws Exception {
		
		if (args == null || args.length == 0) {
			throw new NullPointerException("param can't be null");
		}
		
		WareParam wareParam = new WareParam(args[0]);
		
		WareDocument wareDocument = new WareDocument(wareParam);
		
		Map<String, Object> param = new HashMap<String, Object>();;
		
		WareContext wareContext = new WareContext(param);
		
//		drive(wareDocument.getRootElement(), wareContext);
		WareElement wareElement = new WareElement(wareDocument.getRootElement(), wareContext);
		
		drive(wareElement);
	}
	
	public void drive(WareElement wareElement) throws Exception {
		Driver driver = KeywordsUtil.getDriver(wareElement.getElement());
		try {
			driver.drive(wareElement.getContext());
			for (Iterator<? extends Node> it = wareElement.getElement().elementIterator(); it.hasNext();) {
				Element subElement = (Element) it.next();
				drive(new WareElement(subElement, wareElement.getContext()));
			}
		} catch (WareException e) {
			driver.dealWareException(e);
		}
	}
}
