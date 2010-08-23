package ware.lang.design.node;

import java.util.List;

import ware.lang.design.Ware$Node;

/**
 * 子元素只有一个并且是文本
 * @author yanchangyou
 * @date 2010-8-21 23:50:18
 * @version 1.1.0
 *
 */
public interface Ware$TextElementNode extends Ware$Node {
	
	/**
	 * 获取所有属性节点
	 * @return 所有属性节点
	 */
	public List<Ware$AttributeNode> getAttributes();
	
	/**
	 * 设置属性节点
	 * @param attributes
	 */
	public void setAttributes(List<Ware$AttributeNode> attributes);
	
	/**
	 * 获取文本元素
	 * @return 文本元素
	 */
	public Ware$TextNode getTextNode();
	
	/**
	 * 设置文本元素
	 * @param textNode
	 */
	public void setTextNode(Ware$TextNode textNode);
	
	
	/**
	 * 获取标签名称
	 * @return 标签名称
	 */
	public String getTagName();

	/**
	 * 设置标签名称
	 * @param name
	 */
	public void setTagName(String name);
}
