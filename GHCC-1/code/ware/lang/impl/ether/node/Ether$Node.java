package ware.lang.impl.ether.node;

import java.util.ArrayList;
import java.util.List;

import ware.lang.design.node.Node;

/**
 * Node ware的语言的顶层概念, ware由一个个节点描述<br>
 * 
 * 
 * @author yanchangyou
 * @date 2010-08-20 00:59:30
 * @version 1.0.0
 * 
 */
public class Ether$Node implements Node {

	protected String tag;

	protected Node nextNode;
	protected Node preNode;
	protected Node supNode;
	protected List<Node> subNodes = new ArrayList<Node>();

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Node getPreNode() {
		return preNode;
	}

	public void setPreNode(Node preNode) {
		this.preNode = preNode;
	}

	public Node getSupNode() {
		return supNode;
	}

	public void setSupNode(Node supNode) {
		this.supNode = supNode;
	}

	public List<Node> getSubNodes() {
		return subNodes;
	}

	public void addSubNode(Node node) {
		subNodes.add(node);
	}

}
