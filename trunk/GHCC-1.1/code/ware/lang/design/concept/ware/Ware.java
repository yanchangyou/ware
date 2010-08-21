package ware.lang.design.concept.ware;

import ware.lang.design.concept.ware.base.WareID;
import ware.lang.design.drive.Service;
import ware.lang.design.node.Element;


/**
 * ware接口<br><br>
 * 一个ware就是一个具有端口的实体<br>
 * 此ware通过端口与其它ware交互<br>
 * ware具有生命, 有诞生和消亡<br>
 * <br>
 * ware的关键字有:<br>
 * <ul>
 * 	<li> ware : 代表一个实体, 在计算机中开辟的一个计算区域</li>
 * 	<li> scene : 代表一个场景, 所有的ware交互在场景中产生</li>
 * 	<li> connect : 在ware之间进行连接, 所有的交互建立在连接的基础上</li>
 * 	<li> request,respone : 代表ware之间的同级交互模型, 也是服务模式</li>
 * 	<li> plan,report : 代表ware之间的上下级交互模式, 也是任务模式</li>
 * </ul>
 * <br>
 * 
 * @author yanchangyou
 * @date 2010-08-22 22:20:06
 * @version 1.1.0
 *
 */
public interface Ware extends WareConcept, Service, Element {

	/**
	 * 获取ware的模型<br>
	 * 每个具体的ware都来源于一个模型
	 * @return 模型的名称
	 */
	public String getModel();
	
	/**
	 * 获取ware id
	 * @return wareID
	 */
	public WareID getWareID();
	
	/**
	 * ware诞生的方法
	 */
	public void born();
	
	/**
	 * ware消亡的方法
	 */
	public void die();
}
