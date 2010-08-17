package ware.lang.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Server {

	List<Ware> wareList = new ArrayList<Ware>();
	
	Map<String, String> attributeMap = new HashMap<String, String>();
	
	public void addWare(Ware ware) {
		wareList.add(ware);
	}
	
	public Ware getWare(String port) {
		for (Iterator<Ware> iterator = wareList.iterator(); iterator.hasNext();) {
			Ware ware = (Ware) iterator.next();
			if (port.equals(ware.getPort()+"")) {
				return ware;
			}
		}
		return null;
	}
	
	public void addAttribute(String name, String value) {
		attributeMap.put(name, value);
	}
}
