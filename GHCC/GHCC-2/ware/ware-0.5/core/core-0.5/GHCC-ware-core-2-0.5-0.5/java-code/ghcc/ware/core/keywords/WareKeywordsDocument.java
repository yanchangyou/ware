package ghcc.ware.core.keywords;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Namespace;

public class WareKeywordsDocument {

	private Namespace namespace;
	private Document keywordsDocument;
	private ClassLoader classLoader;
	
	public WareKeywordsDocument(Namespace namespace) {
		this.namespace = namespace;
	}
	
	public Namespace getNamespace() {
		return namespace;
	}
	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}
	public Document getKeywordsDocument() {
		return keywordsDocument;
	}
	public void setKeywordsDocument(Document keywordsDocument) {
		this.keywordsDocument = keywordsDocument;
	}
	public Element getRootElement() {
		return this.keywordsDocument.getRootElement();
	}
	
	public ClassLoader getClassLoader() {
		return classLoader;
	}

	public void setClassLoader(ClassLoader loader) {
		this.classLoader = loader;
	}
}
