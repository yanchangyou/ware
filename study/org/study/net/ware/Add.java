package org.study.net.ware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Add {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8813);
		while (true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					BufferedReader reader = null;
					PrintWriter writer = null;
					try {
						writer = new PrintWriter(socket.getOutputStream());
						writer.println();
						writer.flush();
						
						reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						
						char[] buf = new char[1];

						StringBuffer a = new StringBuffer();
						while (reader.read(buf) != -1 && buf[0] != ' ') {
							a.append(buf[0]);
						};
						
						StringBuffer b = new StringBuffer();
						buf = new char[1];
						while (reader.read(buf) != -1 && buf[0] != '\n' && buf[0] != ' ' && buf[0] != '\r') {
							b.append(buf[0]);
						}
						
						String result = "" + (Integer.parseInt(a.toString().trim())+Integer.parseInt(b.toString().trim()));
						
						
						writer.println(result);
						writer.flush();
						
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							reader.close();
							socket.close();
							writer.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();
		}
	}
}
