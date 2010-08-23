package ware.lang.impl.ether.abstracts.node;

import ware.lang.design.node.Ware$AttributeNode;
import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractNode;

/**
 * 属性节点
 * @author yanchangyou
 * @date 2010-8-21 23:49:53
 * @version 1.1.0
 *
 */
public abstract class Ether$Ware$AbstractAttributeNode extends Ether$Ware$AbstractNode implements Ware$AttributeNode {
	
	protected String value;
	/**
	 * 获取值
	 * @return 值
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * 设置值
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public void check() {
		// TODO Auto-generated method stub
		
	}

	public void parse() {
		// TODO Auto-generated method stub
		
	}
}
