package demo.action.hello.entity;

import java.util.List;

import ware.lang.design.Ware$Entity;
import ware.lang.design.Ware$Node;
import ware.lang.design.drive.Ware$Execute;
import ware.lang.design.node.Ware$AttributeNode;
import ware.lang.design.node.Ware$TextNode;
import ware.lang.design.node.Ware$TextElementNode;
import demo.action.hello.concept.HelloConcept;

public class HelloEntity implements Ware$Entity, HelloConcept, Ware$TextElementNode, Ware$Execute {

	String nodeName;
	
	public void hello() {
		
	}

	public String getNodeName() {
		return nodeName;
	}

	public void check() {
	}

	public void parse() {
	}

	public void drive() {
		execute();
	}

	public void execute() {
		hello();
	}

	public List<Ware$AttributeNode> getAttributes() {
		return null;
	}

	public Ware$TextNode getTextNode() {
		return null;
	}

	public String getTagName() {
		return null;
	}

	public void load() {
		
	}

	public void build() {
		
	}

	public Ware$Node getNode() {
		return this;
	}

	public boolean needBeforeBuildDo() {
		return false;
	}

	public void beforeBuildDo() {
	}

	public boolean needAfterBuildDo() {
		return false;
	}

	public void afterBuildDo() {
		
	}

	public void setNode(Ware$Node node) {
		// TODO Auto-generated method stub
		
	}
}
