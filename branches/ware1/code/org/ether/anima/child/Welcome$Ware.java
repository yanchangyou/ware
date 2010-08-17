package org.ether.anima.child;

import java.io.IOException;


/*

============================welcome.ware.xml===============================

<ware name="welcome">
	<service name="default">
		<speak>hello ${host}:${port}, welcome to ware world!</speak>
	</service>
</ware>

===========================================================================
=====编译ware=====
java -jar ware.jar welcome.ware.xml
=====生成ware.jar包=====
welcome.ware.jar
=====运行ware======
java -jar welcome.ware.jar port=8811
 
*/


public class Welcome$Ware extends Ware {

	public Welcome$Ware(int port) {
		super(port);
	}

	public static void main(String[] args) throws IOException {
		if (args != null && args.length > 0 && args[0].split("=").length > 1) {
			String portString = args[0].split("=")[1];
			int port = Integer.parseInt(portString);
			new Welcome$Ware(port).born();
		}
	}
	
	public void default$ware() {
		
	}
	
}
