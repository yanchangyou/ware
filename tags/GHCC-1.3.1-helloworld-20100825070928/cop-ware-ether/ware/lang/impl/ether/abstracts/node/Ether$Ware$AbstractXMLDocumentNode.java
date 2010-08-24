package ware.lang.impl.ether.abstracts.node;

import ware.lang.design.node.Ware$XMLDocumentNode;
import ware.lang.impl.ether.abstracts.Ether$Ware$AbstractNode;


/**
 * xml文档<br>
 * 可以是一个文件, 也可以是一个完整的xml字符串
 * @author yanchangyou
 * @date 2010-8-21 23:50:23
 * @version 1.1.0
 *
 */
public abstract class Ether$Ware$AbstractXMLDocumentNode extends Ether$Ware$AbstractNode implements Ware$XMLDocumentNode {

	protected String version;
	protected String encoding;
	/**
	 * 获取xml文档版本
	 * @return xml文档版本
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * 获取xml编码
	 * @return xml编码
	 */
	public String getEncoding() {
		return encoding;
	}
}
