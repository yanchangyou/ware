package ware.lang.design.node;

import ware.lang.design.Ware$Node;

/**
 * 为本元素
 * @author yanchangyou
 * @date 2010-8-21 23:50:14
 * @version 1.1.0
 *
 */
public interface Ware$TextNode extends Ware$Node {

	/**
	 * 获取文本内容
	 * @return
	 */
	public String getTextContext();
	
	/**
	 * 设置文本内容
	 */
	public void setTextContext(String textContext);
}
