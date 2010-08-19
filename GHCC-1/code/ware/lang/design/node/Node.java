package ware.lang.design.node;

/**
 * Node ware的语言的顶层概念, ware由一个个节点描述<br>
 * 
 * 
 * @author yanchangyou
 * @date 2010-08-19 23:56:01
 * @version 1.0.0
 *
 */
public interface Node extends Relation, RelationOperate {

	/**
	 * 获取节点的标签
	 * @return 标签名称
	 */
	public String getTag();
	
}
