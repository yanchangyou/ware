package ware.core;

import java.util.Map;

public interface Execute {

	public void execute(Map<String,Object> context);
	
	@Deprecated
	public void execute();
	
}
