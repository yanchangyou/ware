package ware.lang.design;

import ware.lang.design.concept.base.Description;
import ware.lang.design.concept.base.Name;

/**
 * 概念(concept) : 面向概念编程的起点<br>
 * 概念作为human与computer直接的逻辑接口<br>
 * 面向概念编程基于以下想法<br>
 * human要使用computer, 只要human把概念传递给computer<br>
 * 然后computer根据概念来完成human的要求<br>
 * <br>
 * 概念进入computer有以下方式<br>
 * <ul>
 * 	<li>代码层面---对应Node</li>
 * 	<li>内存层面---对应Entity</li>
 * 	<li>CPU层面---对应Drive</li>
 * </ul>
 * 
 * 流程如下:<br>
 * 1，我们获得某个概念<br>
 * 2，我们把概念写进代码里面<br>
 * 3，我们把代码读到内存当中,并且把概念构建在内存当中<br>
 * 4，我们把概念放到CPU中执行<br>
 * <br>
 * @author yanchangyou
 *
 */
public interface Concept {

	/**
	 * 获取名称
	 * @return 名称
	 */
	public Name getName();
	
	/**
	 * 获取描述
	 * @return 描述
	 */
	public Description getDescription();
	
}
