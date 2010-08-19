package ware.lang.impl.ether.concept.activeconcept;

import ware.lang.design.concept.activeconcept.Scene;
import ware.lang.design.concept.staticconcept.SceneID;
import ware.lang.design.concept.staticconcept.SceneType;


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
public class Ether$Scene extends Ether$ActiveConcept implements Scene {

	public SceneID getSceneID() {
		// TODO Auto-generated method stub
		return null;
	}

	public SceneType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	public void execute() {
		// TODO Auto-generated method stub
		
	}

	
}
