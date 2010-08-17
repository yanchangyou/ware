package org.study.net.ware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.mvel.MVEL;

public class Express {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8814);
		while(true) {
			final Socket socket = server.accept();
			
			new Thread() {
				public void run() {
					PrintWriter writer = null;
					BufferedReader reader = null;
					try {
						writer = new PrintWriter(socket.getOutputStream());
						writer.println();
						writer.flush();
						
						reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						String express = reader.readLine();
						
						String result = MVEL.evalToString(express, null);
						
						writer.println(result);
						writer.flush();
					} catch (Exception e) {
						e.printStackTrace();
						writer.println(e.getMessage());
						writer.flush();
					} finally {
						try {
							reader.close();
							writer.close();
							socket.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
				}
			}.start();
		}
	}
}
