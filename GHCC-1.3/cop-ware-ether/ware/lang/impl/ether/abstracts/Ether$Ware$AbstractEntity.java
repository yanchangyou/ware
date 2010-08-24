package ware.lang.impl.ether.abstracts;

import ware.lang.design.Ware$Entity;


/**
 * 实体 : 把概念以实体的形式加载到内存中
 * @author yanchangyou
 * @date 2010-8-22 23:12:44
 * @version 1.2.0
 *
 */
public abstract class Ether$Ware$AbstractEntity implements Ware$Entity {

	protected boolean needDoBeforeBuild;
	
	protected boolean needDoAfterBuild;
}
