package com.cdk.gist.fileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ConcurrentHashMap;

public class MyFileReading {
	private final String folderPath;
	private final String fileName;
	private  RandomAccessFile raf;
	
	int offset=0;
	public MyFileReading(String folderPath, String fileName) throws FileNotFoundException{
		this.folderPath=folderPath;
		this.fileName=fileName;
		init();
	}
	private void init() throws FileNotFoundException{
		raf=new RandomAccessFile(new File(fileName), "r");
	}

	public void readFile(String fileName) throws IOException{
	
//		long fileLength=raf.length();
//		raf.
		
		// 
		
	//	ConcurrentHashMap<K, V>
		
	}
}
