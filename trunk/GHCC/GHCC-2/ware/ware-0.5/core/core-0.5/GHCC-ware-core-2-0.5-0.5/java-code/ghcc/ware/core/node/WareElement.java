package ghcc.ware.core.node;

import ghcc.ware.core.context.WareContext;
import ghcc.ware.core.drive.Driver;
import ghcc.ware.core.exception.WareException;
import ghcc.ware.core.util.KeywordsUtil;

import org.dom4j.Element;


public class WareElement {
	private WareContext context;
	private Element element;
	
	public WareElement(Element element, WareContext wareContext) throws WareException, Exception {
		this.element = element;
		context = wareContext;
		wareContext.setThisElement(this);
	}
	
	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public WareContext getContext() {
		return context;
	}

	public void setContext(WareContext context) {
		this.context = context;
	}

	public void drive() throws WareException, Exception {
		Driver driver = KeywordsUtil.getDriver(element);
		try {
			driver.drive(context);
			
		} catch (WareException e) {
			driver.dealWareException(e);
		}
		
	}
}
