package ware.lang.design.concept;

import ware.lang.design.drive.Drive;

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
public interface Connect extends Drive {

	/**
	 * 获取ware所在场景
	 * @return ware的场景
	 */
	public SceneID getSceneID();
	
	/**
	 * 连接到ware的场景
	 * @param sceneID
	 */
	public void connect(SceneID sceneID);
}
