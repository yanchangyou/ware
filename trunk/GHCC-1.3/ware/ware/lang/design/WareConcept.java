package ware.lang.design;

import org.cop.Concept;


/**
 * 概念(concept) : 面向概念编程的起点<br>
 * <br>
 * 面向概念编程的核心是:提出概念->表达概念->加载概念->驱动概念<br>
 * 以下以java和xml来实践面向概念编程, 待成熟后扩展到其它语言<br>
 * 具有实现如下:<br>
 * 1 , concept  : 提出概念-->写成一个java接口<br>
 * 2 , node     : 表达概念-->通过xml的某种类型的节点来编写表达概念<br>
 * 3 , entity   : 加载概念-->写一个java类实现concept提出的接口,并且初始化成对象加载到内存之中<br>
 * 4 , drive    : 驱动概念-->把需要驱动的概念驱动起来,到CPU中执行指令<br>
 * 
 * @author yanchangyou
 * @date 2010-8-22 23:10:42
 * @version 1.2.0
 *
 */
public interface WareConcept extends Concept {

	/**
	 * 获取名称
	 * @return 名称
	 */
	public String getConceptName();
	
	/**
	 * 获取描述
	 * @return 描述
	 */
	public String getConceptDescription();
	
}
