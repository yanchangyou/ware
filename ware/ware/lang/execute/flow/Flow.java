package ware.lang.execute.flow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Element;

import ware.lang.execute.ExecuteExcepion;
import ware.lang.execute.ExecuteNode;
import ware.lang.execute.NoExecuteClassFoundException;

public class Flow extends ExecuteNode {

	protected List<ExecuteNode> subFlow = new ArrayList<ExecuteNode>();
	
	@SuppressWarnings("unchecked")
	public void init(Element dom4jElement) throws NoExecuteClassFoundException {
		super.init(dom4jElement);
		List<Element> elementsList = dom4jElement.elements();
		for (Iterator<Element> iterator = elementsList.iterator(); iterator.hasNext();) {
			Element element = iterator.next();
			String elementName = element.getName();
			ExecuteNode executeNode = createExecuteNode(elementName);
			executeNode.init(element);
			subFlow.add(executeNode);
		}
	}

	@Override
	public void execute() throws ExecuteExcepion {
		for (Iterator<ExecuteNode> iterator = subFlow.iterator(); iterator.hasNext();) {
			ExecuteNode executeNode =  iterator.next();
			executeNode.execute();
		}
	}
}
