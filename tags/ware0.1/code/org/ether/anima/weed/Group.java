package org.ether.anima.weed;

/**
 * 
 * name : Group.java
 * 
 * 通过group机制, 实现群组功能, 将现有的ware和group组合起来实现更复杂的ware
 * 
 * @author yanchangyou
 *
 */
public interface Group extends Ware {

	/**
	 * 吸纳ware
	 * @param ware
	 */
	public void absorb(Ware ware);
	

	/**
	 * 遣散,驱逐ware
	 * @param ware
	 */
	public void expel(Ware ware);

}
