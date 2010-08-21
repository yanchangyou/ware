package ware.lang.design;

import ware.lang.design.concept.base.Name;

/**
 * 节点 : 概念在代码层面上的体现<br>
 * <br>
 * 注:目前只考虑xml中的节点, 待成熟之后扩展到其它语言
 * @author yanchangyou
 * @date 2010-8-21 23:50:41
 * @version 1.1.0
 *
 */
public interface Node {
	
	/**
	 * 获取名称
	 * @return 名称
	 */
	public Name getNodeName();
	
}
