package ware.lang.design.concept.activeconcept;

import ware.lang.design.concept.staticconcept.WareProtocolData;


/**
 * response : waer的响应<br>
 * <br>
 * request的请求通过response来响应
 * 
 * 
 * @author yanchangyou
 *
 */
public interface Response extends Deliver {

	/**
	 * 获取响应的ware data
	 * @return
	 */
	public WareProtocolData getResponeWareProtocolData();
}
