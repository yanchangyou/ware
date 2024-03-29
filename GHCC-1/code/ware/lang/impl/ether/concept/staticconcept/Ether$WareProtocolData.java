package ware.lang.impl.ether.concept.staticconcept;

import ware.lang.design.concept.staticconcept.SceneID;
import ware.lang.design.concept.staticconcept.SceneType;
import ware.lang.design.concept.staticconcept.WareProtocolData;

/**
 * 
 * WareProtocolData代表一个ware协议的数据<br>
 * ware协议由xml格式描述<br>
 * <br>
 * ware协议有四种类型:<br>

1,请求(request)<br>
<textarea cols="60" rows="5">
<?xml version="1.0" encoding="utf-8"?>
<ware from="SceneID" to="SceneID">
	<request><![CDATA[(XML DATA)]]></request>
</ware>
</textarea><br>

2,响应(response)<br>
<textarea cols="60" rows="5">
<?xml version="1.0" encoding="utf-8"?>
<ware from="SceneID" to="SceneID">
	<response><![CDATA[(XML DATA)]]></response>
</ware>
</textarea><br>

3,安排(plan)<br>
<textarea cols="60" rows="5">
<?xml version="1.0" encoding="utf-8"?>
<ware from="SceneID" to="SceneID">
	<plan><![CDATA[(XML DATA)]]></plan>
</ware>
</textarea><br>

4,汇报(report)<br>
<textarea cols="60" rows="5">
<?xml version="1.0" encoding="utf-8"?>
<ware from="SceneID" to="SceneID">
	<report><![CDATA[(XML DATA)]]></report>
</ware>
</textarea><br>
 * <br>
 * 其中 SceneID 代表ware的不同场景的标识符 格式如下:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp; host:port:scene <br>
 * <br>
 * 类型1,2代表了平级之间的交互方式<br>
 * 类型3,4代表了上下级之间的交互方式<br>
 * <br>
 * 感谢hafeyang@gmail.com提供的无敌textarea方法,使注释里能直接写xml<br>
 * 
 * @author yanchangyou
 * @date 2010-8-19 0:10:49
 * @version 1.0.0
 *
 */
public class Ether$WareProtocolData extends Ether$StaticConcept implements WareProtocolData {

	public SceneID getFrom() {
		// TODO Auto-generated method stub
		return null;
	}

	public SceneType getSceneType() {
		// TODO Auto-generated method stub
		return null;
	}

	public SceneID getTo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getXMLData() {
		// TODO Auto-generated method stub
		return null;
	}
}
