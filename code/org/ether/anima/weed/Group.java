package org.ether.anima.weed;

/**
 * 
 * name : Group.java
 * 
 * ͨ��group����, ʵ��Ⱥ�鹦��, �����е�ware��group�������ʵ�ָ����ӵ�ware
 * 
 * @author yanchangyou
 *
 */
public interface Group extends Ware {

	/**
	 * ����ware
	 * @param ware
	 */
	public void absorb(Ware ware);
	

	/**
	 * ǲɢ,����ware
	 * @param ware
	 */
	public void expel(Ware ware);

}
