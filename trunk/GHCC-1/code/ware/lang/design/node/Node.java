package ware.lang.design.node;

/**
 * Node ware的语言的顶层概念, ware由一个个节点描述<br>
 * 
 * 
 * @author yanchangyou
 *
 */
public interface Node extends Relation, Operate {

	/**
	 * 获取节点的标签
	 * @return 标签名称
	 */
	public String getTag();
}
