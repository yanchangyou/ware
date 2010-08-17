package ware.lang.execute;

import ware.lang.core.Server;
import ware.lang.core.Service;
import ware.lang.core.Ware;

public class ExecuteContext {

	Server server;
	
	Ware ware;
	
	Service service;

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
