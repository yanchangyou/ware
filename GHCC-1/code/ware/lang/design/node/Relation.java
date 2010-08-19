package ware.lang.design.node;

import java.util.List;

/**
 * 节点关联<br>
 * 用于将各个节点关联起来<br>
 * <br>
 * 上下级关系<br>
 * 平级关系<br>
 * 
 * 
 * @author yanchangyou
 * @date 2010-8-19 21:33:58
 * @version 1.0.0
 */
public interface Relation {

	/**
	 * 获取上级节点
	 * @return
	 */
	public Node getSupNode();
	
	/**
	 * 获取下级节点
	 * @return
	 */
	public List<Node> getSubNodes();
	
	/**
	 * 获取前驱节点
	 * @return 前驱节点
	 */
	public Node getPreNode();
	
	/**
	 * 获取后续节点
	 * @return 后续节点
	 */
	public Node getNextNode();
	
}
