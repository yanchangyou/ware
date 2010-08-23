package ware.lang.design.drive;

import ware.lang.design.Ware$Drive;
import ware.lang.design.Ware$Entity;

/**
 * 管理实体 : 执行, 运行, 启动, 停止
 * @author yanchangyou
 * @date 2010-8-22 23:28:17
 * @version 1.2.0
 *
 */
public interface Ware$Manage extends Ware$Drive {
	
	/**
	 * 执行实体
	 */
	public void executeEntity(Ware$Entity entity);
	
	/**
	 * 运行实体
	 * @param entity
	 */
	public void runEntity(Ware$Entity entity);
	
	/**
	 * 启动服务
	 */
	public void startEntity(Ware$Entity entity);
	
	/**
	 * 停止服务
	 */
	public void stopEntity(Ware$Entity entity);
}
