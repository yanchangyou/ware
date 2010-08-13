package org.ether.anima.weed;

/**
 * name : Ware.java<br>
 * 
 * 体系 :<br>
 * <ol>
 * 	<li>[ware体系]由[ware]和[group]构成, [group]定义为: [group] = {ware*, group*}</li>
 *  <li>一个ware有且只有一个对外公开端口, 外界通过此端口与ware建立交互通道, 多端口可以通过[group]来实现</li>
 *  <li>ware有生命周期 : [产生] --> [生存] --> [消亡]</li>
 *  <li>在[生存]期间用[能量]来标识其生命值, 整个体系根据[能量]来分配资源, [能量]与[资源]成正比.</li> 
 * </ol>
 *
 *
 * @author yanchangyou
 * 
 */
public interface Ware {

	//================属性===========
	/**
	 * 获取Ware的端口
	 * @return
	 */
	public int getPort();
	
	/**
	 * 获取能量
	 * @return
	 */
	public double getEnergy();
	
	/**
	 * 产生:一个ware的产生
	 */
	public void born();
	
	/**
	 * 消亡 : 一个ware的消亡
	 */
	public void die();

	
	/**
	 * 生存 : ware生存
	 * 生存是一个存在的现象, 由其自己控制, [产生]和[消亡]由外界控制
	 */
	//public void survive();
	
}
