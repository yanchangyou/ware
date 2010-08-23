package ware.lang.impl.ether.abstracts.node;

import ware.lang.design.node.Ware$TextNode;
import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractNode;

/**
 * 为本元素
 * @author yanchangyou
 * @date 2010-8-21 23:50:14
 * @version 1.1.0
 *
 */
public class Ether$Ware$AbstractTextNode extends Ether$Ware$AbstractNode implements Ware$TextNode {

	protected String textContext;
	
	/**
	 * 获取文本内容
	 * @return
	 */
	public String getTextContext() {
		return textContext;
	}

	public void check() {}

	public void parse() {}

	public void setTextContext(String textContext) {
		this.textContext = textContext;
	}
}
