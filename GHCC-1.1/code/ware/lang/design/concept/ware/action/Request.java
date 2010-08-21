package ware.lang.design.concept.ware.action;

import ware.lang.design.concept.ware.Deliver;
import ware.lang.design.concept.ware.WareProtocolData;


/**
 * request : ware的请求<br>
 * ware之间通过request来请求服务, 然后通过response来响应<br>
 * <br>
 * 
 * @author yanchangyou
 * @date 2010-08-21 23:40:57
 * @version 1.1.0
 */
public interface Request extends Deliver, WareActionConcept {

	/**
	 * 获取请求的ware data
	 * @return
	 */
	public WareProtocolData getRequestWareProtocolData();
}
