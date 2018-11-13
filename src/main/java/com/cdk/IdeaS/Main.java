package com.cdk.IdeaS;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		String currentDirectory=System.getProperty("user.dir");
		System.out.println("Curent Directory : "+currentDirectory);
		String inputFileName="input.txt";
		String outputFileName="output.txt";
		FileReader fileReader =new  FileReader(currentDirectory,inputFileName);
		List<InputModel> inputModelList=fileReader.getInputModelList();
		VersionServices versionServices=new VersionServices(inputModelList);
		FileWriter fileWriter =new  FileWriter(currentDirectory,outputFileName);
		fileWriter.write(versionServices.getMap());		
	}
}
