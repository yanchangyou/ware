package demo.helloworld.c;

import org.dom4j.Element;

import ware.core.WareContext;
import ware.core.exception.WareException;
import ware.core.node.WareElement;
import demo.helloworld.AbstractHellWorld;

public class Printf extends AbstractHellWorld {

	public void drive(WareContext context) throws WareException, Exception {
		WareElement thisElement = context.getThisElement();
		Element e = thisElement.getElement();
		System.out.println("===============[" + e.getNamespacePrefix() + "]==============");
		java.lang.System.out.printf("%s\r\n", e.getText().replaceAll("\t", ""));
		System.out.println();
		
	}
}
