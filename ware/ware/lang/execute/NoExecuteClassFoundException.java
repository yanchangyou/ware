package ware.lang.execute;

public class NoExecuteClassFoundException extends Exception {

	String executeNodeName;
	public NoExecuteClassFoundException(String name) {
		executeNodeName = name;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8378229638942487603L;

}
