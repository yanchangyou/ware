package ware.lang.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.dom4j.Element;

import ware.frame.Namable;
import ware.lang.execute.ExecuteExcepion;
import ware.lang.execute.NoExecuteClassFoundException;
import ware.lang.execute.flow.Flow;

public class Service implements Namable {

	Flow flow;

	Service(Element element) throws WareIOException, NoExecuteClassFoundException {
		flow = new Flow();
		Element flowElement = (Element) element.selectSingleNode("flow");
		flow.init(flowElement);
	}

	void init() {
		
	}
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run(final Ware ware, final Service service, final Socket socket){
		System.out.println("run");
		new Thread() {
			
			public void run() {
				ininServiceContext();
				execute();
				close();
			}
			
			private void close() {
				try {
					//socket.shutdownInput();
					//socket.shutdownOutput();
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			private void initWriter(PrintWriter writer) {
				writer.println();
				writer.flush();
			}
			
			private void ininServiceContext() {
				ServiceContext serviceContext = new ServiceContext();
//				serviceContext.setServer(server);
				serviceContext.setWare(ware);
				serviceContext.setService(service);
				serviceContext.setSocket(socket);
				PrintWriter writer = null;
				BufferedReader reader = null;
				try {
					reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					writer = new PrintWriter(socket.getOutputStream());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				serviceContext.setReader(reader);
				serviceContext.setWriter(writer);
				ServiceContext.setServiceContext(serviceContext);
				
				initWriter(writer);
			}
			
			private void execute() {
				try {
					flow.execute();
				} catch (ExecuteExcepion e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
