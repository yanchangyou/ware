package ware.lang.impl.ether.abstracts.node;

import ware.lang.design.node.Ware$NamespaceNode;
import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractNode;

/**
 * 命名空间
 * @author yanchangyou
 * @date 2010-8-21 23:50:10
 * @version 1.1.0
 *
 */
public abstract class Ether$Ware$AbstractNamespaceNode extends Ether$Ware$AbstractNode implements Ware$NamespaceNode {
	protected String prefix;
	protected String namespaceURL;
	/**
	 * 名称空间前缀
	 * @return 空间前缀
	 */
	public String getPrefix() {
		return prefix;
	}
	
	/**
	 * 获取对应的url
	 * @return 对应的url
	 */
	public String getNamespaceURL() {
		return namespaceURL;
	}
}
