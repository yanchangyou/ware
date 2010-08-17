package org.study.net.ware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8812);
		while (true) {
			
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					try {
						PrintWriter writer = new PrintWriter(socket.getOutputStream());
						writer.println();
						writer.flush();
						BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						writer.println(reader.readLine());
						writer.flush();
						reader.close();
						writer.close();
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}.start();
		}
	}
}
