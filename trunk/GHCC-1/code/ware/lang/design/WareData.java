package ware.lang.design;

/**
 * 
 * WareData代表一个ware协议的数据<br>
 * ware协议由xml格式描述<br>
 * <br>
 * ware协议有四种类型:<br>

1,请求(request)<br>
<textarea cols="60" rows="5">
<?xml version="1.0" encoding="utf-8"?>
<ware from="ware URI" to="ware URI">
	<request><![CDATA[(XML DATA)]]></request>
</ware>
</textarea><br>

2,响应(response)<br>
<textarea cols="60" rows="5">
<?xml version="1.0" encoding="utf-8"?>
<ware from="ware URI" to="ware URI">
	<response><![CDATA[(XML DATA)]]></response>
</ware>
</textarea><br>

3,安排(plan)<br>
<textarea cols="60" rows="5">
<?xml version="1.0" encoding="utf-8"?>
<ware from="ware URI" to="ware URI">
	<plan><![CDATA[(XML DATA)]]></plan>
</ware>
</textarea><br>

4,汇报(report)<br>
<textarea cols="60" rows="5">
<?xml version="1.0" encoding="utf-8"?>
<ware from="ware URI" to="ware URI">
	<report><![CDATA[(XML DATA)]]></report>
</ware>
</textarea><br>
 * <br>
 * 其中 ware URI 代表ware的标识符 格式如下:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp; host:port:scene <br>
 * <br>
 * 类型1,2代表了平级之间的交互方式<br>
 * 类型3,4代表了上下级之间的交互方式<br>
 * 
 * @author yanchangyou
 * @date 2010-8-19 0:10:49
 * @version 1.0.0
 *
 */
public interface WareData {

	/**
	 * 获取数据来源的ware URI
	 * @return
	 */
	public String getFrom();
	
}
