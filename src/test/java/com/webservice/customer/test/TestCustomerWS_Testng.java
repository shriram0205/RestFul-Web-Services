package com.webservice.customer.test;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.webservice.core.HttpClientUtil;
import com.webservice.core.ServiceValidationUtil;
import com.webservice.core.XmlParsingUtil;
import com.webservice.customer.bean.Customer;


public class TestCustomerWS_Testng {
	
	
//////////////////////////////GET///////////////////////////////////
	
	@Test(priority=0)
	public void testWithValidData() throws ClientProtocolException, IOException, JAXBException{
	
		System.out.println("Running 200 status code test");
		String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/2";
		
		HttpResponse response = HttpClientUtil.sendAndReceiveGetRequest(url);
		
		ServiceValidationUtil.performStandardValidationsFor200(response);
		
		//perform specific validations
		String responseMsg = HttpClientUtil.getResponsemsgString(response);
	    System.out.println(responseMsg.toString());
	    
	}

}

