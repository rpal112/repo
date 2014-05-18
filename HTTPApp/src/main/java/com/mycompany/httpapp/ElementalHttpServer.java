/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.httpapp;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;


public class ElementalHttpServer{

	public static void main( String[] args ) throws JsonParseException, IOException
	{
		HttpClient client = HttpClientBuilder.create().build();

		HttpGet jsonRequest = new HttpGet("http://petstore.swagger.wordnik.com/api/api-docs");
		HttpResponse response = client.execute(jsonRequest);

		ObjectMapper jsonMapper = new ObjectMapper();

		Details doc = jsonMapper.readValue(response.getEntity().getContent(), Details.class);
		System.out.println(doc.getApiVersion());
		System.out.println(doc.getInfo().getTitle());
		System.out.println(doc.getInfo().getContact());
		System.out.println(doc.getInfo().getDescription());
		System.out.println(doc.getInfo().getLicense());
		System.out.println(doc.getInfo().getLicenseUrl());
		System.out.println(doc.getInfo().getTermsOfServiceUrl());

		File htmlFile = new File("swagger.html");

		BufferedWriter htmlWriter = new BufferedWriter(new FileWriter(htmlFile));
		htmlWriter.write("<html>\n");

		htmlWriter.write("<head>\n");

		htmlWriter.write("<link href='https://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'/>\n");
		htmlWriter.write("<link href='css/reset.css' media='screen' rel='stylesheet' type='text/css'/>\n");
		htmlWriter.write("<link href='css/screen.css' media='screen' rel='stylesheet' type='text/css'/>\n");

		htmlWriter.write("<link href='https://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'/>\n");
		htmlWriter.write("<link href='css/reset.css' media='screen' rel='stylesheet' type='text/css'/>\n");
		htmlWriter.write("<link href='css/screen.css' media='screen' rel='stylesheet' type='text/css'/>\n");

		htmlWriter.write("</head>\n");

		htmlWriter.write("<body>\n");
		htmlWriter.write("<h1>"+doc.getInfo().getTitle()+"</h1>\n");
		htmlWriter.write("<p>"+doc.getInfo().getDescription()+"</p>\n");
		htmlWriter.write("<a href="+doc.getInfo().getTermsOfServiceUrl()+">"+"Terms of service"+"</a><br>\n");
		htmlWriter.write("<a href=mailto:"+doc.getInfo().getContact()+">"+"Contact the developer"+"</a><br>\n");
		htmlWriter.write("<a href="+doc.getInfo().getLicenseUrl()+">"+"Apache 2.0"+"</a><br>\n");

		htmlWriter.write("</text" + "area>\n");
		htmlWriter.write("</body>\n");
		htmlWriter.write("</html>\n");

		htmlWriter.close();

		Desktop.getDesktop().browse(htmlFile.toURI());
	}
    
}
