package ware.lang.design.concept.ware;

import ware.lang.design.drive.Execute;


/**
 * 传送ware协议数据<br>
 * <br>
 * 
 * @author yanchangyou
 * @date 2010-08-19 21:58:59
 * @version 1.1.0
 *
 */
public interface Deliver extends WareConcept, Execute {

	public void deliver(WareProtocolData wareProtocolData);
	
}
