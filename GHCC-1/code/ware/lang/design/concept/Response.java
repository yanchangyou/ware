package ware.lang.design.concept;

import ware.lang.design.drive.Drive;

/**
 * response : waer的响应<br>
 * <br>
 * request的请求通过response来响应
 * 
 * 
 * @author yanchangyou
 *
 */
public interface Response extends Drive {

	/**
	 * 获取响应的ware data
	 * @return
	 */
	public WareProtocol getResponeWareProtocol();
}
