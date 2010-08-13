package ware.lang.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import test.welcome.Welcome;
import ware.frame.Namable;
import ware.lang.execute.NoExecuteClassFoundException;

public class Ware implements Namable {
	final Document document;
	@SuppressWarnings("unchecked")
	public Ware(String wareXMLPath) throws DocumentException, WareIOException, NoExecuteClassFoundException, FileNotFoundException {
		this(Welcome.class.getResourceAsStream(wareXMLPath));
	}
	
	public Ware(InputStream input) throws DocumentException, WareIOException, NoExecuteClassFoundException, FileNotFoundException {
		
		SAXReader saxReader = new SAXReader();
		this.document = saxReader.read(input);
		
		Element wareElement = (Element) document.selectSingleNode("ware");
		port = Integer.parseInt(wareElement.attribute("port").getValue());
		List<Element> elementList = wareElement.elements();
		for (Iterator<Element> iterator = elementList.iterator(); iterator.hasNext();) {
			Element element = iterator.next();
			String elementName = element.selectSingleNode("@name").getText();
			Service service = new Service(element);
			serviceMap.put(elementName, service);
		}
		
	}
	public Ware(File wareXMLFile) throws DocumentException, WareIOException, NoExecuteClassFoundException, FileNotFoundException {
		this(new FileInputStream(wareXMLFile));
	}

	Map<String, Service> serviceMap = new HashMap<String, Service>();

	ServerSocket serverSocket;
	
	int port;

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	public void addService(Service service) {
		serviceMap.put(service.getName(), service);
	}
	
	public Service getService() {
		return serviceMap.get(name);
	}
	public void born() throws IOException {
		born(port);
	}
	
	public void born(final int port) throws IOException {
		new Thread() {
			public void run() {
				try {
					serverSocket = new ServerSocket(port);
				} catch (IOException e) {
					e.printStackTrace();
				}
				while(true) {
					Socket socket = null;
					try {
						socket = serverSocket.accept();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					for (Iterator<String> iterator = serviceMap.keySet().iterator(); iterator.hasNext();) {
						String name = iterator.next();
						Service service = serviceMap.get(name);
						service.run(Ware.this, service, socket);
					}
				}
			}
		}.start();
		
	}

	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
