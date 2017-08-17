package com.webservice.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;


public class HttpClientUtil {
	
	private static HttpClient getHttpClient() {
		HttpClient client = HttpClientBuilder.create().build();
		//HttpClient client = getHttpClient();
		return client;
	}
	
	public static String getStatusMsg(HttpResponse response) {
		return response.getStatusLine().getReasonPhrase();
	}


	public static int getStatusCode(HttpResponse response) {
		return response.getStatusLine().getStatusCode();
	}

	public static String getResponsemsgString(HttpResponse response) throws IOException {
		String responseMsg;
		BufferedReader rd = new BufferedReader(
				new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line + "\n");
			}
			responseMsg = result.toString();	
		return responseMsg;
	}
	
	
	
	
	public static HttpResponse sendAndReceiveGetRequest(String url) throws IOException, ClientProtocolException {
		
		HttpClient client = getHttpClient();
		HttpGet requestMsg = new HttpGet(url);
		HttpResponse response = client.execute(requestMsg);
		
		int statusCode = response.getStatusLine().getStatusCode();
		String statusMsg = response.getStatusLine().getReasonPhrase();
		System.out.println("Status code is " +statusCode);
		System.out.println("Status Msg is " +statusMsg+"\n");
		return response;
	}
	
	
	
}
