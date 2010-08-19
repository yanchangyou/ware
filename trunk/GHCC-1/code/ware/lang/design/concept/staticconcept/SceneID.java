package ware.lang.design.concept.staticconcept;

/**
 * 场景ID<br>
 * 用于标识唯一的场景<br>
 * 由三部分构成:<br>
 * <ul>
 * 	<li>主机(host)</li>
 * 	<li>端口(port)</li>
 * 	<li>场景(scene)</li>
 * </ul>
 * @author yanchangyou
 *
 */
public interface SceneID extends WareID {

	/**
	 * 获取场景名称
	 * @return 场景名称
	 */
	public String getSceneName();
	
	/**
	 * 获取场景ID
	 * @return
	 */
	public String getSceneID();
	
}
