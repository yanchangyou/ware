package ware.lang.impl.ether.abstracts.node;

import java.util.Iterator;
import java.util.List;

import ware.lang.design.node.Ware$AttributeNode;
import ware.lang.design.node.Ware$TextElementNode;
import ware.lang.design.node.Ware$TextNode;
import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractNode;

/**
 * 子元素只有一个并且是文本
 * @author yanchangyou
 * @date 2010-8-21 23:50:18
 * @version 1.1.0
 *
 */
public abstract class Ether$Ware$AbstractTextElementNode extends Ether$Ware$AbstractNode implements Ware$TextElementNode {
	
	protected List<Ware$AttributeNode> attributes;
	protected Ware$TextNode text;
	
	/**
	 * 获取所有属性节点
	 * @return 所有属性节点
	 */
	public List<Ware$AttributeNode> getAttributes() {
		return attributes;
	}

	/**
	 * 按照属性名称提取属性
	 * @param attributeName
	 * @return
	 */
	public Ware$AttributeNode getAttributeByName(String attributeName) {
		for (Iterator iterator = attributes.iterator(); iterator.hasNext();) {
			Ware$AttributeNode attributeNode = (Ware$AttributeNode) iterator.next();
			if(attributeNode.getNodeName().equals(attributeName)) {
				return attributeNode;
			}
		}
		return null;
	}
	
	/**
	 * 获取文本元素
	 * @return 文本元素
	 */
	public Ware$TextNode getTextNode() {
		return text;
	}
	
	public String getTagName() {
		return this.getNodeName();
	}
}
