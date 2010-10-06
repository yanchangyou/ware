package ghcc.ware.helloworld.speak;

import ghcc.ware.core.context.WareContext;
import ghcc.ware.core.drive.Driver;
import ghcc.ware.core.exception.WareException;
import ghcc.ware.core.node.WareElement;

import org.dom4j.Element;

public class SpeakWords implements Driver {

	public void drive(WareContext context) throws WareException,
			Exception {
		WareElement thisElement = context.getThisElement();

		Element e = thisElement.getElement();
		System.out.println(e.getText());
	}

	public void dealWareException(WareException paramWareException)
			throws WareException, Exception {
		
		
	}

}
