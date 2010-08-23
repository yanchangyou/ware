package ware.lang.impl.ether.abstracts;

import ware.lang.design.Ware$Node;


/**
 * 节点 : 概念在代码层面上的体现<br>
 * 抽象实现
 * @author yanchangyou
 * @date 2010-8-22 23:14:32
 * @version 1.2.0
 *
 */
public abstract class Ether$Ware$AbstractNode implements Ware$Node {

	protected String nodeName;
	
	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
}
