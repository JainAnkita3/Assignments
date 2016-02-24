package com.test.internetConnChk;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * This class will check Internet Connection
 * 
 * @author ank
 *
 */
public class InternetConnChk {

	public static void main(String[] args) {

		try {
			// Provide the URL to connect
			URL url = new URL("https://www.google.com");
			// Opening a connection
			URLConnection conn = url.openConnection();
			// Trying to Connect to given URL
			conn.connect();
			System.out.println("Connection Established....Internet working fine");

		} catch (MalformedURLException e) {
			System.out.println("Bad Url");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Sorry, No Internet Connection\n");
			e.printStackTrace();
		}

	}

}
