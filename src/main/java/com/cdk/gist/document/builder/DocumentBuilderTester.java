package com.cdk.gist.document.builder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public abstract class DocumentBuilderTester {

	public static void main(String[] args) throws ParserConfigurationException {

		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		//Document document=db.parse(is);
	}
}
