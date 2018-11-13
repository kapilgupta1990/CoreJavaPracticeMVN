package com.cdk.companies.ubs;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class FileOperations {
	private File file;
	private Scanner scanner;

	public FileOperations(File file) throws FileNotFoundException {
		this.file = file;
		this.scanner = new Scanner(new FileInputStream(file));
	}

	public String readLine() {
		
		if (scanner.hasNextLine()) {
			return scanner.nextLine();
		}
		return null;

	}

}

class Producer extends Thread {

	private FileOperations fileOperations;
	public Producer(){
		this.fileOperations=fileOperations;
	}
	@Override
	public void run() {
		File file = new File("/Users/guptak/Documents/carguru-tab.txt");
		Scanner scanner=null;
		BufferedInputStream reader=null;
		try {
			 reader=new BufferedInputStream(new FileInputStream(file));
			//bis.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while( true ) {
	        try {
				if( reader.available() > 0 ) {
				    System.out.print( (char)reader.read() );
				}
				else {
				    try {
				        sleep( 500 );
				    }
				    catch( InterruptedException ex ) {
				       // running = false;
				    }
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

}

class Consumer extends Thread {

}

public class FileReadingWriting {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		Producer producer=new Producer();
		producer.start();
		producer.join();
	}

}
