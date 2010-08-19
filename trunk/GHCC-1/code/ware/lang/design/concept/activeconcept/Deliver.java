package ware.lang.design.concept.activeconcept;

import ware.lang.design.concept.staticconcept.WareProtocolData;

/**
 * 传送ware协议数据<br>
 * <br>
 * 
 * @author yanchangyou
 * @date 2010-08-19 21:58:59
 * @version 1.0.0
 *
 */
public interface Deliver extends ActiveConcept {

	public void deliver(WareProtocolData wareProtocolData);
	
}
