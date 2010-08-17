package org.study.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetTest {

	public static void main(String[] args) throws IOException {

		int port = 8811;
		ServerSocket serverSocket = new ServerSocket(port);

		System.out.println("server begin");
		while (true) {

			final Socket socket = serverSocket.accept();

			new Thread() {
				public void run() {
					try {
						BufferedReader read = new BufferedReader(new InputStreamReader(socket
								.getInputStream()));
						BufferedWriter write = new BufferedWriter(
								new OutputStreamWriter(socket.getOutputStream()));

						String local = ""
								+ socket.getLocalSocketAddress().toString()
										.substring(1);
						String remote = ""
								+ socket.getRemoteSocketAddress().toString()
										.substring(1);

						String msg = "hi " + remote + ", welcome " + local
								+ "\r\n";

						write.write(msg);
						write.flush();

						String SENTENCE_PREFIX = ">>";
						String str = null;

						write.write(">>");
						write.flush();

						String EXIT_PATTERN = "(?i)exit|bye|close|quit";

						while ((str = read.readLine()) != null) {
							if (str.matches(EXIT_PATTERN)) {
								break;
							}
							System.out.println(SENTENCE_PREFIX + str);
							write.write(">>");
							write.flush();
						}
						String goodbye = "Good bye, " + remote;
						System.out.println(goodbye);
						write.write(goodbye);
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
		System.out.println("server end");
	}

}
