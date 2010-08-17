package ware.lang.execute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import ware.lang.core.ServiceContext;
import ware.lang.core.WareIOException;

public class ExecuteTool {
	public static void speak(String context) {
		PrintWriter writer = ServiceContext.getServiceContext().getWriter();
		writer.println(context);
		writer.flush();
	}

	public static String listen() throws WareIOException {
		String context;
		BufferedReader reader = ServiceContext.getServiceContext().getReader();
		try {
			context = reader.readLine();
		} catch (IOException e) {
			throw new WareIOException(e);
		}
		
		return context;
	}

}
