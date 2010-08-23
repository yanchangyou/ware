package demo.action.hello.entity;

import java.util.List;

import ware.lang.design.Ware$Entity;
import ware.lang.design.Ware$Node;
import ware.lang.design.drive.Ware$Execute;
import ware.lang.design.node.Ware$Attribute;
import ware.lang.design.node.Ware$Text;
import ware.lang.design.node.Ware$TextElement;
import demo.action.hello.concept.HelloConcept;

public class HelloEntity implements Ware$Entity, HelloConcept, Ware$TextElement, Ware$Execute {

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

	public List<Ware$Attribute> getAttributes() {
		return null;
	}

	public Ware$Text getTextNode() {
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
}
