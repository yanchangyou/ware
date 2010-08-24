package ware.lang.impl.ether.defaults.node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import ware.lang.design.node.Ware$AttributeNode;
import ware.lang.impl.ether.abstracts.node.Ether$Ware$AbstractTextElementNode;

/**
 * 子元素只有一个并且是文本
 * @author yanchangyou
 * @date 2010-8-21 23:50:18
 * @version 1.1.0
 *
 */
public class Ether$Ware$DefaultTextElementNode extends Ether$Ware$AbstractTextElementNode {
	
	protected Element dom4jElement;
	public void check(String nodeString) throws Exception {
		DocumentHelper.parseText(nodeString);
	}

	public void parse(String nodeString) throws Exception {
		Document document = null;
		try {
			document = DocumentHelper.parseText(nodeString);
		} catch (DocumentException e) {
			//can't occur, because check() method check this
		} 
		
		dom4jElement = document.getRootElement();

		//自身节点
		this.nodeName = dom4jElement.getName();
		
		//属性节点
		List list = dom4jElement.attributes();
		attributes = new ArrayList<Ware$AttributeNode>(list.size());
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Attribute attribute = (Attribute) iterator.next();
			Ware$AttributeNode attributeNode = new Ether$Ware$DefaultAttributeNode();
			String attributeXML = attribute.asXML();
			attributeNode.check(attributeXML);
			attributeNode.parse(attributeXML);
			attributes.add(attributeNode);
		}
		//文本节点
		text = new Ether$Ware$DefaultTextNode();
		String textContent = dom4jElement.getText();
		text.check(textContent);
		text.parse(textContent);
	}
	
}
