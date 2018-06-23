package com.cdk.gist.io;

import java.io.File;
import java.io.FileNotFoundException;

public class MultiThreadFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("/Users/guptak/Downloads/clickstream.0.12.1007.606860718.1526176800000");
		long fileSize=file.length();
		
		System.out.println("File size"+fileSize);
		//BufferedReader br=new BufferedReader(new FileReader(file));
		//br.
	}
}
