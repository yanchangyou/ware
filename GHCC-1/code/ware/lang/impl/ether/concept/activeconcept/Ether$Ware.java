package ware.lang.impl.ether.concept.activeconcept;

import ware.lang.design.concept.activeconcept.Ware;
import ware.lang.design.concept.staticconcept.WareID;


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
 * @date 2010-8-18 23:26:28
 * @version 1.0.0
 *
 */
public class Ether$Ware extends Ether$ActiveConcept implements Ware {

	protected String model;
	protected WareID wareID;
	
	public void setModel(String model) {
		this.model = model;
	}

	public void born() {
		
	}

	public void die() {
		
	}

	public String getModel() {
		return model;
	}

	public WareID getWareID() {
		return wareID;
	}

	public void execute() {
		born();
	}

}
