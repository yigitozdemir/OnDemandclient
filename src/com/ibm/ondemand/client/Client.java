package com.ibm.ondemand.client;

import java.util.Properties;

import com.ibm.edms.od.ODConfig;
import com.ibm.edms.od.ODConstant;
import com.ibm.edms.od.ODServer;

public class Client {
	private String hostname = "192.168.1.20";
	private String username = "ADMIN";
	private String password = "Passw1rd";
	private int port = 1445;
	private String applicationName = "TEST";
	
	public void connect() throws Exception {
		Properties props = new Properties();
		props.setProperty(ODConfig.ODWEK_INSTALL_DIR, "/opt/IBM/ondemand/V10.5");
		
		ODConfig cfg = new ODConfig(ODConstant.PLUGIN, ODConstant.APPLET, null, 200, "/applets", "ENU", "/arstmp", "/arstrc", 4, props);

				
		
		ODServer server = new ODServer(cfg);
		server.setConnectType(ODConstant.CONNECT_TYPE_TCPIP);
		server.setServerName(hostname);
		server.setPort(port);
		server.setUserId(username);
		server.setPassword(password);
		server.initialize(applicationName);
		server.logon( );
		
		System.out.println("Connected");
		
		server.logoff();
	}
}
