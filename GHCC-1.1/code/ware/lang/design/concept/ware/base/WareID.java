package ware.lang.design.concept.ware.base;

/**
 * 
 * ware id : 标识ware的唯一ID<br>
 * 由两部分构成:<br>
 * <ul>
 * 	<li>主机(host)</li>
 * 	<li>端口(port)</li>
 * </ul>
 * 
 * @author yanchangyou
 * @date 2010-8-21 23:44:39
 * @version 1.1.0
 *
 */
public interface WareID extends WareBaseConcept {

	/**
	 * 获取主机
	 * @return 主键地址
	 */
	public String getHost();
	
	/**
	 * 获取端口
	 * @return 端口
	 */
	public int getPort();
	
	/**
	 * 获取ware ID
	 * @return ware ID
	 */
	public String getWareID();
	
}
