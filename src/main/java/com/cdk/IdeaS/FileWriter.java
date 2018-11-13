package com.cdk.IdeaS;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Set;

public class FileWriter {

	private final String currentDirectory;
	private String outputFileName;
	public FileWriter(String currentDirectory, String outputFileName) throws IOException {

		this.currentDirectory=currentDirectory;
		this.outputFileName=outputFileName;
		 
	}

	public void write(Set<String> map) throws IOException {
		BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(currentDirectory, outputFileName));
		Iterator<String> iteratorString=map.iterator();
		StringBuilder db=new  StringBuilder();
		while(iteratorString.hasNext()){
			db.append(iteratorString.next()).append(System.getProperty("line.separator"));
		}
		bufferedWriter.write(db.toString());
		bufferedWriter.flush();
		bufferedWriter.close();
	}

}