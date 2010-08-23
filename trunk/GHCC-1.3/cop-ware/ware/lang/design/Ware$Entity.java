package ware.lang.design;

import org.cop.norm.Entity;


/**
 * 实体 : 把概念以实体的形式加载到内存中
 * @author yanchangyou
 * @date 2010-8-22 23:12:44
 * @version 1.2.0
 *
 */
public interface Ware$Entity extends Entity {

	/**
	 * 加载java对象
	 */
	public void load();
	
	/**
	 * 在内存中构建实体
	 */
	public void build();
	
	/**
	 * 获取节点来构建实体
	 */
	public Ware$Node getNode();
	
	/**
	 * 是否需要在构建之前做什么
	 * @return
	 */
	public boolean needBeforeBuildDo();
	
	/**
	 * 在构建之前需要做什么
	 */
	public void beforeBuildDo();
	

	/**
	 * 是否需要在构建之后做什么
	 * @return
	 */
	public boolean needAfterBuildDo();
	
	/**
	 * 在构建之后需要做什么
	 */
	public void afterBuildDo();
	
}
