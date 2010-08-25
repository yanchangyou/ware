package ware.lang.design;

import org.cop.norm.Node;

/**
 * 节点 : 概念在代码层面上的体现<br>
 * <br>
 * 注:目前只考虑xml中的节点, 待成熟之后扩展到其它语言
 * 
 * @author yanchangyou
 * @date 2010-8-22 23:14:32
 * @version 1.2.0
 * 
 */
public interface Ware$Node extends Ware, Node {

	/**
	 * 获取名称
	 * 
	 * @return 名称
	 */
	public String getNodeName();

	/**
	 * 检查节点
	 */
	public void check(String nodeString) throws Exception;

	/**
	 * 解析节点
	 */
	public void parse(String nodeString) throws Exception;

}
