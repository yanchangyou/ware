package ware.lang.design.node;

import java.util.List;

import ware.lang.design.Node;

/**
 * 子元素只有一个并且是文本
 * @author yanchangyou
 * @date 2010-8-21 23:50:18
 * @version 1.1.0
 *
 */
public interface TextElement extends Node {
	
	/**
	 * 获取所有属性节点
	 * @return 所有属性节点
	 */
	public List<Attribute> getAttributes();
	
	/**
	 * 获取文本元素
	 * @return 文本元素
	 */
	public Text getTextNode();
	
	/**
	 * 获取标签名称
	 * @return 标签名称
	 */
	public String getTagName();
}
