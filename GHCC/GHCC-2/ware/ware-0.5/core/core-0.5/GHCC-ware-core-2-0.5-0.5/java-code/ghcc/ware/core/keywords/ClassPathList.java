package ghcc.ware.core.keywords;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Element;
import org.dom4j.Node;

public class ClassPathList {

	List<ClassPath> classPathList = new ArrayList<ClassPath>();
	ClassPathList(Element classPathListElement) {
		for (Iterator<Node> it = classPathListElement.iterator(); it.hasNext();) {
			Node classPathElement = it.next();
			classPathList.add(new ClassPath(classPathElement.getText().trim()));
		}
	}
	public List<ClassPath> getClassPathList() {
		return classPathList;
	}
}

class ClassPath {
	String classPath;
	ClassPath(String classPath) {
		this.classPath = classPath;
	}
}
