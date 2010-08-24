package ware.lang.design.node;


/**
 * xml文档<br>
 * 可以是一个文件, 也可以是一个完整的xml字符串
 * @author yanchangyou
 * @date 2010-8-21 23:50:23
 * @version 1.1.0
 *
 */
public interface Ware$XMLDocumentNode extends Ware$ElementNode {

	/**
	 * 获取xml文档版本
	 * @return xml文档版本
	 */
	public String getVersion();
	
	/**
	 * 获取xml编码
	 * @return xml编码
	 */
	public String getEncoding();
	
	/**
	 * 获取根元素
	 * @return 根元素
	 */
	public Ware$ElementNode getRootElement();
}
