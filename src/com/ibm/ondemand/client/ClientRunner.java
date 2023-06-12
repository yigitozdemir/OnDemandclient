package com.ibm.ondemand.client;

public class ClientRunner {

	public static void main(String[] args) {
		try
		{
			Client client = new Client();
			client.connect();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
