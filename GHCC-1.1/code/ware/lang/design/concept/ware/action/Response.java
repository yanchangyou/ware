package ware.lang.design.concept.ware.action;

import ware.lang.design.concept.ware.Deliver;
import ware.lang.design.concept.ware.WareProtocolData;


/**
 * response : ware的响应<br>
 * <br>
 * request的请求通过response来响应
 * 
 * 
 * @author yanchangyou
 * @date 2010-8-21 23:44:09
 * @version 1.1.0
 *
 */
public interface Response extends Deliver, WareActionConcept {

	/**
	 * 获取响应的ware data
	 * @return
	 */
	public WareProtocolData getResponeWareProtocolData();
}
