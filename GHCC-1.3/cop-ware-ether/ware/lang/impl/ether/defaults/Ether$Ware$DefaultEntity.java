package ware.lang.impl.ether.defaults;

import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractEntity;

/**
 * 实体 : 把概念以实体的形式加载到内存中
 * 
 * @author yanchangyou
 * @date 2010-8-22 23:12:44
 * @version 1.2.0
 * 
 */
public class Ether$Ware$DefaultEntity extends Ether$Ware$AbstractEntity
		implements Ether$Ware$Default {

	protected boolean needDoBeforeBuild;

	protected boolean needDoAfterBuild;

	public void load() {

	}

	public void build() {
		// TODO Auto-generated method stub

	}

	public boolean needDoBeforeBuild() {
		// TODO Auto-generated method stub
		return false;
	}

	public void beforeBuildDo() {
		// TODO Auto-generated method stub

	}

	public boolean needDoAfterBuild() {
		// TODO Auto-generated method stub
		return false;
	}

	public void afterBuildDo() {
		// TODO Auto-generated method stub

	}
}
