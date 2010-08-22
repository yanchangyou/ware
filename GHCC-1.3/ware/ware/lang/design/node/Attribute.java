package ware.lang.design.node;

import ware.lang.design.WareNode;

/**
 * 属性节点
 * @author yanchangyou
 * @date 2010-8-21 23:49:53
 * @version 1.1.0
 *
 */
public interface Attribute extends WareNode {
	
	/**
	 * 获取值
	 * @return 值
	 */
	public String getValue();
}
