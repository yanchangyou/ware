package ware.lang.design;

/**
 * 
 * ware所在的场景<br>
 * ware的所有行为活动都是在特定的场景发生<br>
 * <br>
 * 场景分为两类<br>
 * 	<ul>
 * 		<li>service : 服务场景, 外界请求服务, ware响应服务</li>
 * 		<li>task : 任务场景, 外界分配任务, ware执行任务</li>
 * 	</ul>
 * @author yanchangyou
 * @date 2010-8-18 23:27:17
 * @version 1.0.0
 *
 */
public interface Scene {

	/**
	 * 获取场景的名称
	 * @return 场景名称
	 */
	public String getName();
	
	/**
	 * 获取场景类型: service or task
	 * @return 场景类型
	 */
	public String getType();
	
}
