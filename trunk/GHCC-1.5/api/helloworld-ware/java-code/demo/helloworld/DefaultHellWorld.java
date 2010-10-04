package demo.helloworld;

import org.dom4j.Element;

import ware.core.context.WareContext;
import ware.core.exception.WareException;
import ware.core.node.WareElement;

public class DefaultHellWorld extends AbstractHellWorld {
	public void drive(WareContext context) throws WareException, Exception {
		WareElement thisElement = context.getThisElement();

		Element e = thisElement.getElement();
		System.out.println("===============[" + e.getNamespacePrefix() + "]==============");
		java.lang.System.out.println(e.getText().replaceAll("\t", "").replaceAll("\n\n", ""));
		System.out.println();
	}

}
