package ware.lang.design.concept;

import ware.lang.design.drive.Drive;

/**
 * request : ware的请求<br>
 * ware之间通过request来请求服务, 然后通过response来响应<br>
 * <br>
 * 
 * @author yanchangyou
 * @date 2010-8-18 23:40:57
 */
public interface Request extends Drive {

	/**
	 * 获取请求的ware data
	 * @return
	 */
	public WareProtocol getRequestWareProtocol();
}
