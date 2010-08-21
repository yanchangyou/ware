package ware.lang.design.drive;

import ware.lang.design.Drive;

/**
 * 服务驱动 : 启动, 停止
 * @author yanchangyou
 * @date 2010-8-21 23:49:45
 * @version 1.1.0
 *
 */
public interface Service extends Drive {

	/**
	 * 启动
	 */
	public void start();
	
	/**
	 * 停止
	 */
	public void stop();
}
