package ware.lang.impl.ether.defaults.node;

import ware.lang.design.node.Ware$ElementNode;
import ware.lang.impl.ether.abstracts.node.Ether$Ware$AbstractNamespaceNode;


/**
 * xml文档<br>
 * 可以是一个文件, 也可以是一个完整的xml字符串
 * @author yanchangyou
 * @date 2010-8-21 23:50:23
 * @version 1.1.0
 *
 */
public class Ether$Ware$DefaultXMLDocumentNode extends Ether$Ware$AbstractNamespaceNode {
	
	Ware$ElementNode elementNode;
	
	/**
	 * 获取根元素
	 * @return 根元素
	 */
	public Ware$ElementNode getRootElement() {
		return elementNode;
	}

	public void check(String nodeString) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void parse(String nodeString) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
