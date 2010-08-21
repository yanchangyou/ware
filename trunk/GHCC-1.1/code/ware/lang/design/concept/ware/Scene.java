package ware.lang.design.concept.ware;

import ware.lang.design.concept.ware.base.SceneID;
import ware.lang.design.concept.ware.base.SceneType;
import ware.lang.design.drive.Service;
import ware.lang.design.node.Element;


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
 * @date 2010-08-22 22:19:56
 * @version 1.1.0
 *
 */
public interface Scene extends WareConcept, Service, Element {

	/**
	 * 获取场景ID
	 * @return 场景ID
	 */
	public SceneID getSceneID();
	
	/**
	 * 获取场景类型: service or task
	 * @return 场景类型
	 */
	public SceneType getType();
	
	/**
	 * 获取在此场景下的资源
	 * @return 资源
	 */
	public Resource getResource();
	
	
	/**
	 * 获取流程
	 * @return
	 */
	public Flow getFlow();
	
}
