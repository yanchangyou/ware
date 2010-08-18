package ware.lang.design;

/**
 * 连接<br>
 * 实现ware之间的连接<br>
 * <br>
 * 连接格式(ware URI)如下:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;<b><code>host:port:scene</code></b><br>
 * 如 : 127.0.0.1:8811:welcome<br>
 * 
 * 
 * @author yanchangyou
 * @date 2010-8-18 23:37:09
 * @version 1.0.0
 *
 */
public interface Connect {

	/**
	 * 获取ware的地址<br>
	 * 格式 : <code>host:port:scene</code>
	 * @return 访问ware的地址
	 */
	public String getTo();
	
	/**
	 * 获取ware所在主机
	 * @return ware主机
	 */
	public String getHost();
	
	/**
	 * 获取ware所在端口
	 * @return ware端口
	 */
	public String getPort();
	
	/**
	 * 获取ware所在场景
	 * @return ware的场景
	 */
	public String getScene();
}
