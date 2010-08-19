package ware.lang.impl.ether.concept.activeconcept;

import ware.lang.design.concept.activeconcept.Connect;
import ware.lang.design.concept.staticconcept.SceneID;


/**
 * 连接<br>
 * 实现ware之间的场景连接<br>
 * <br>
 * 连接格式(SceneID)如下:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;<b><code>host:port:scene</code></b><br>
 * 如 : 127.0.0.1:8811:welcome<br>
 * 
 * 
 * @author yanchangyou
 * @date 2010-8-18 23:37:09
 * @version 1.0.0
 * 
 * 修改使用场景ID替代原来的多属性
 * @date 2010-8-19 21:24:22
 * @version 1.0.1
 *
 */
public class Ether$Connect extends Ether$ActiveConcept implements Connect {

	public void connect(SceneID sceneID) {
		// TODO Auto-generated method stub
		
	}

	public SceneID getSceneID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
