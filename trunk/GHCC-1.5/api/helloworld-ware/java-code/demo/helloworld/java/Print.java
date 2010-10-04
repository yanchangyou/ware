package demo.helloworld.java;

import ware.core.WareContext;
import ware.core.exception.WareException;
import ware.core.node.WareElement;
import demo.helloworld.AbstractHellWorld;

public class Print extends AbstractHellWorld {

	public void drive(WareContext context) throws WareException, Exception {
		WareElement thisElement = context.getThisElement();
		java.lang.System.out.print(thisElement.getElement().getText());
	}

	
}
