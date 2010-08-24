package demo.action.hello.entity;

import java.util.List;

import ware.lang.design.Ware$Entity;
import ware.lang.design.drive.Ware$Execute;
import ware.lang.design.node.Ware$AttributeNode;
import ware.lang.design.node.Ware$TextElementNode;
import ware.lang.design.node.Ware$TextNode;
import ware.lang.impl.ether.defaults.node.Ether$Ware$DefaultTextElementNode;
import demo.action.hello.concept.HelloConcept;

public class HelloEntity implements Ware$Entity, HelloConcept, Ware$TextElementNode, Ware$Execute {
	
	Ware$TextElementNode textElementNode = new Ether$Ware$DefaultTextElementNode();
	
	public void hello() {
		String content = textElementNode.getTextNode().getTextContent();
		System.out.print(content);
	}

	public String getNodeName() {
		return textElementNode.getNodeName();
	}

	public void check(String nodeString) throws Exception {
		textElementNode.check(nodeString);
	}

	public void parse(String nodeString) throws Exception {
		textElementNode.parse(nodeString);
	}

	public void drive() {
		execute();
	}

	public void execute() {
		hello();
	}

	public List<Ware$AttributeNode> getAttributes() {
		return textElementNode.getAttributes();
	}

	public Ware$TextNode getTextNode() {
		return textElementNode.getTextNode();
	}

	public String getTagName() {
		return textElementNode.getTagName();
	}

	public void load() {
		
	}

	/**
	 * 1，为对象赋值
	 * 2， 建立对象树
	 */
	public void build() {
		textElementNode.getAttributes();
	}

	public boolean needDoBeforeBuild() {
		Ware$AttributeNode needDoBeforeBuildAttibute = textElementNode.getAttributeByName("needDoBeforeBuild");
		return needDoBeforeBuildAttibute!=null && "true".equals(needDoBeforeBuildAttibute.getValue());
	}

	public void beforeBuildDo() {
		
	}

	public boolean needDoAfterBuild() {
		Ware$AttributeNode needDoAfterBuildAttibute = textElementNode.getAttributeByName("needDoAfterBuild");
		return needDoAfterBuildAttibute!=null && "true".equals(needDoAfterBuildAttibute.getValue());
	}

	public void afterBuildDo() {
		this.drive();
	}

	public Ware$AttributeNode getAttributeByName(String attributeName) {
		return textElementNode.getAttributeByName(attributeName);
	}
}
