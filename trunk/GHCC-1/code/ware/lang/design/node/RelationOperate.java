package ware.lang.design.node;


/**
 * 关系的操作<br>
 * 实现节点直接的关系的建立<br>
 * 
 * @author yanchangyou
 * @date 2010-08-19 23:57:05
 * @version 1.0.0
 *
 */
public interface RelationOperate extends Operate {

	/**
	 * 设置上级节点
	 * @param node
	 */
	public void setSupNode(Node node);
	
	/**
	 * 添加下级节点
	 * @param node
	 */
	public void addSubNode(Node node);
	
	/**
	 * 设置前驱节点
	 * @param node
	 */
	public void setPreNode(Node node);
	
	/**
	 * 设置后续节点
	 * @param node
	 */
	public void setNextNode(Node node);
	
}
