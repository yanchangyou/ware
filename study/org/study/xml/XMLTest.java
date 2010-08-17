package org.study.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import test.welcome.Welcome;

public class XMLTest {

	public static void main(String[] args) throws Exception {
		SAXReader saxReader = new SAXReader();
		String wareXMLPath = "test.xml";
		Document document = saxReader.read(XMLTest.class.getResourceAsStream(wareXMLPath));
		System.out.println(document);
	}
}
