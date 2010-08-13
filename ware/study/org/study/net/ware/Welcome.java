package org.study.net.ware;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * 
 * 
 * 	<ware name="Welcome" port="8811">
 * 		<listen port="8811">
 * 			<speak>Welcome to WARE world!</speak>
 * 		</listen>
 * 	</ware>
 * 
 * 	<net address="192.168.1">
 * 
 * 	</net>
 * 
 * 	<server>
 * 		<ware port="8811" default="test.welcome">
 * 			<service name="test.welcome">
 * 				<speak>Welcome to WARE world!</speak>
 * 			</service>
 * 		</ware>
 * 	</server>
 * 
 *  <server name="test" defualt="">
 * 		<ware name="test" port="8811" default="test.welcome">
 * 			<service name="test.welcome">
 * 				<speak>
 * 					<invoke service="test:test:test.welcome">
 * 						<speak>My name is ware.</speak>
 * 					</invoke>
 * 				<speak>
 * 				<call ware=""></call>
 * 				<connect server=""></connect>
 * 			</service>
 * 		</ware>
 * 	</server>
 * 
 * 
 * @author yanchangyou
 *
 */
public class Welcome {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(8811);
		while(true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					try {
						PrintWriter writer = new PrintWriter(socket.getOutputStream());
						writer.println("Welcome to WARE world!");
						writer.flush();
						writer.close();
						socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
	
	
}
