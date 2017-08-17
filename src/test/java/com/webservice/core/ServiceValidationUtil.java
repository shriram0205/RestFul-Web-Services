package com.webservice.core;

import org.apache.http.HttpResponse;
import org.testng.Assert;

public class ServiceValidationUtil {
	
	
	private static final String STATUS_CODE_SUCCESS_MSG = "OK";
	private static final int STATUS_CODE_SUCCESS = 200;


	public static void performStandardValidationsFor200(HttpResponse response) {
		Assert.assertEquals(HttpClientUtil.getStatusCode(response), STATUS_CODE_SUCCESS);
		Assert.assertEquals(HttpClientUtil.getStatusMsg(response), STATUS_CODE_SUCCESS_MSG);
	}
}
	
	