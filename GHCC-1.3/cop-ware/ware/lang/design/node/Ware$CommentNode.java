package ware.lang.design.node;

import ware.lang.design.Ware$Node;

/**
 * 注释
 * 
 * @author yanchangyou
 * @date 2010-8-21 23:49:57
 * @version 1.1.0
 * 
 */
public interface Ware$CommentNode extends Ware$Node {

	/**
	 * 获取注释
	 * 
	 * @return 注释
	 */
	public String getComment();
}
