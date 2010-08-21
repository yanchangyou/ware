package ware.lang.design.node;

import ware.lang.design.Node;

/**
 * 命名空间
 * @author yanchangyou
 * @date 2010-8-21 23:50:10
 * @version 1.1.0
 *
 */
public interface Namespace extends Node {

	/**
	 * 名称空间前缀
	 * @return 空间前缀
	 */
	public String getPrefix();
	
	/**
	 * 获取对应的url
	 * @return 对应的url
	 */
	public String getNamespaceURL();
}
