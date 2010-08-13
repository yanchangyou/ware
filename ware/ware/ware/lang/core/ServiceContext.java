package ware.lang.core;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServiceContext {
	@SuppressWarnings("unchecked")
	private static ThreadLocal<ServiceContext> localContext = new ThreadLocal();

	public static void setServiceContext(ServiceContext serviceContext) {
		localContext.set(serviceContext);
	}

	public static ServiceContext getServiceContext() {
		return localContext.get();
	}

	Server server;

	Ware ware;

	Service service;
	
	Socket socket;

	PrintWriter writer;

	BufferedReader reader;

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public BufferedReader getReader() {
		return reader;
	}

	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}

	public PrintWriter getWriter() {
		return writer;
	}

	public void setWriter(PrintWriter writer) {
		this.writer = writer;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	public Ware getWare() {
		return ware;
	}

	public void setWare(Ware ware) {
		this.ware = ware;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}
