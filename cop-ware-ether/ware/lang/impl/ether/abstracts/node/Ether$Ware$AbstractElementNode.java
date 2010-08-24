package ware.lang.impl.ether.abstracts.node;

import java.util.List;

import ware.lang.design.node.Ware$AttributeNode;
import ware.lang.design.node.Ware$ElementNode;
import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractNode;

/**
 * 元素 : 可以包含子节点的节点
 * @author yanchangyou
 * @date 2010-8-21 23:50:06
 * @version 1.1.0
 *
 */
public class Ether$Ware$AbstractElementNode extends Ether$Ware$AbstractNode implements Ware$ElementNode {
	
	protected List<Ware$AttributeNode> attributes;
	protected List<Ware$ElementNode> subElements;
	/**
	 * 获取所有属性节点
	 * @return 所有属性节点
	 */
	public List<Ware$AttributeNode> getAttributes() {
		return attributes;
	}
	
	/**
	 * 获取子元素
	 * @return 子元素
	 */
	public List<Ware$ElementNode> getSubElements() {
		return subElements;
	}
	
	/**
	 * 获取标签名称
	 * @return 标签名称
	 */
	public String getTagName() {
		return this.nodeName;
	}

	public void check(String nodeString) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void parse(String nodeString) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
