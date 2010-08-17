package org.study.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	static {
		try {
			for (int i = 0; i < 1; i++) {
				main(null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

//		String localHost = "127.0.0.1";
//		int localPort = 10001;

		String remoteHost = "127.0.0.1";
		int remotePort = 8811;

		final Socket socket = new Socket(remoteHost, remotePort);

		
//		socket.getChannel();
//		socket.getOutputStream();

		try {
		BufferedReader read = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));

		String str = null;
		while ((str = read.readLine()) != null) {
			System.out.println(str);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}

		// InetSocketAddress remote = new InetSocketAddress(remoteHost,
		// remotePort);
		// socket.connect(remote);

//		Thread t1 = new Thread() {
//			public void run() {
//				try {
//					BufferedReader read = new BufferedReader(
//							new InputStreamReader(socket.getInputStream()));
//
//					String str = null;
//					while ((str = read.readLine()) != null) {
//						System.out.println(str);
//					}
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//
//		// write
//		Thread t2 = new Thread() {
//			public void run() {
//
//				BufferedWriter write;
//				try {
//					write = new BufferedWriter(new OutputStreamWriter(socket
//							.getOutputStream()));
//					for (int j = 0; j < 100; j++) {
//						write.write("" + j + "\r\n");
//						write.flush();
//					}
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//		
//		
//		t1.start();
//		t2.start();

//		t1.join();
//		t2.join();
		
//		Thread.currentThread().isDaemon();.setDaemon(true);

	}
}
