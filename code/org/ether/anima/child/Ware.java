package org.ether.anima.child;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ware {

	private int port;
	
	public Ware(int port) {
		this.port = port;
	}
	
	public int getPort() {
		return port;
	}

	public void born() throws IOException {
		System.out.println("ware is born");

		ServerSocket serverSocket = new ServerSocket(port);

		System.out.println("server begin");
		while (true) {

			final Socket socket = serverSocket.accept();

			new Thread() {
				public void run() {
					try {
						BufferedWriter write = new BufferedWriter(
								new OutputStreamWriter(socket.getOutputStream()));
						write.write("hello");
						write.flush();
						
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();

			if (1 == 2) {
				break;
			}
		}

	}
	
	public void die() {
		
	}
	
	public void speak(Ware ware) {
		
	}
	
	public void listen(Ware ware) {
		
	}
	
	public static void main(String[] args) throws IOException {
		int port = 10001;
		
		Ware ware = new Ware(port);
		
		ware.born();
		
		ware.die();
		
	}
}
