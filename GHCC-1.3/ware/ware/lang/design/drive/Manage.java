package ware.lang.design.drive;

import ware.lang.design.WareDrive;
import ware.lang.design.WareEntity;

/**
 * 管理实体 : 执行, 运行, 启动, 停止
 * @author yanchangyou
 * @date 2010-8-22 23:28:17
 * @version 1.2.0
 *
 */
public interface Manage extends WareDrive {
	
	/**
	 * 执行实体
	 */
	public void executeEntity(WareEntity entity);
	
	/**
	 * 运行实体
	 * @param entity
	 */
	public void runEntity(WareEntity entity);
	
	/**
	 * 启动服务
	 */
	public void startEntity(WareEntity entity);
	
	/**
	 * 停止服务
	 */
	public void stopEntity(WareEntity entity);
}
