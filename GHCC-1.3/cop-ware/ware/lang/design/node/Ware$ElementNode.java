package ware.lang.design.node;

import java.util.List;

import ware.lang.design.Ware$Node;

/**
 * 元素 : 可以包含子节点的节点
 * 
 * @author yanchangyou
 * @date 2010-8-21 23:50:06
 * @version 1.1.0
 * 
 */
public interface Ware$ElementNode extends Ware$Node {

	/**
	 * 获取所有属性节点
	 * 
	 * @return 所有属性节点
	 */
	public List<Ware$AttributeNode> getAttributes();

	/**
	 * 获取子元素
	 * 
	 * @return 子元素
	 */
	public List<Ware$ElementNode> getSubElements();

	/**
	 * 获取标签名称
	 * 
	 * @return 标签名称
	 */
	public String getTagName();
}
