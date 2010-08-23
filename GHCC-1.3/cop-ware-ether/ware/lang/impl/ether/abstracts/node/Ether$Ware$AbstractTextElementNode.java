package ware.lang.impl.ether.abstracts.node;

import java.util.List;

import ware.lang.design.node.Ware$AttributeNode;
import ware.lang.design.node.Ware$TextNode;
import ware.lang.design.node.Ware$TextElementNode;
import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractNode;

/**
 * 子元素只有一个并且是文本
 * @author yanchangyou
 * @date 2010-8-21 23:50:18
 * @version 1.1.0
 *
 */
public class Ether$Ware$AbstractTextElementNode extends Ether$Ware$AbstractNode implements Ware$TextElementNode {
	
	protected List<Ware$AttributeNode> attributes;
	protected Ware$TextNode text;
	
	/**
	 * 获取所有属性节点
	 * @return 所有属性节点
	 */
	public List<Ware$AttributeNode> getAttributes() {
		return attributes;
	}
	

	public void setAttributes(List<Ware$AttributeNode> attributes) {
		this.attributes = attributes;
	}
	
	/**
	 * 获取文本元素
	 * @return 文本元素
	 */
	public Ware$TextNode getTextNode() {
		return text;
	}
	

	public void setTextNode(Ware$TextNode text) {
		this.text = text;
		
	}
	

	public void check() {
		
	}

	public void parse() {
		
	}


	public String getTagName() {
		return this.getNodeName();
	}


	public void setTagName(String name) {
		this.setNodeName(name);
	}
}
