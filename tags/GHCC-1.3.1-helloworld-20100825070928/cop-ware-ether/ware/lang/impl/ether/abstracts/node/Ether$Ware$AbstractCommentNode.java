package ware.lang.impl.ether.abstracts.node;

import ware.lang.design.node.Ware$CommentNode;
import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractNode;


/**
 * 注释
 * @author yanchangyou
 * @date 2010-8-21 23:49:57
 * @version 1.1.0
 *
 */
public abstract class Ether$Ware$AbstractCommentNode extends Ether$Ware$AbstractNode implements Ware$CommentNode {
	protected String comment;
	/**
	 * 获取注释
	 * @return 注释
	 */
	public String getComment() {
		return comment;
	}
}
