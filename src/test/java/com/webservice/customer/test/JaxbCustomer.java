package com.webservice.customer.test;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.webservice.customer.bean.Customer;

public class JaxbCustomer {

	public static void main(String[] args) throws JAXBException {
		Customer c1 = new Customer();
		c1.setId(2);
		c1.setFname("John");
		c1.setLname("milar");
		c1.setStreet("first street");
		c1.setCity("sj");
		
		// Java obj to Xml---Marshelling..
		
		marsgelling(c1);
		
		
	}

	private static void marsgelling(Customer c1) throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		StringWriter writer = new StringWriter();
		marshaller.marshal(c1,writer);
		
	}


}
