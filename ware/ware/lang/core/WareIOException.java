package ware.lang.core;

import java.io.IOException;

public class WareIOException extends IOException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8036880970612488439L;

	IOException ioExecption;
	public WareIOException(IOException e) {
		ioExecption = e;
		e.printStackTrace();
	}
}
