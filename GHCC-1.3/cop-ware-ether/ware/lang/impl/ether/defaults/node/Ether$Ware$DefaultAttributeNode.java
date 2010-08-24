package ware.lang.impl.ether.defaults.node;

import ware.lang.impl.ether.abstracts.node.Ether$Ware$AbstractAttributeNode;

/**
 * 属性节点
 * 
 * @author yanchangyou
 * @date 2010-8-21 23:49:53
 * @version 1.1.0
 * 
 */
public class Ether$Ware$DefaultAttributeNode extends
		Ether$Ware$AbstractAttributeNode {

	public void check(String nodeString) throws Exception {
		if (nodeString == null || !nodeString.matches("\\w+\\s*=\\s*\".*\"")) {
			throw new IllegalArgumentException(nodeString);
		}
	}

	public void parse(String nodeString) throws Exception {
		String[] nameValue = nodeString.split("=");
		this.nodeName = nameValue[0];
		this.value = nameValue[1].substring(1,nameValue[1].length()-1);
	}
}
