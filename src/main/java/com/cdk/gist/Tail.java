package com.cdk.gist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Tail implements Runnable {

	private RandomAccessFile raf;
	private long fileLength;
	private long filePointer = 0;
	private File _file;

	public Tail() {
		try {
			_file = new File("/Users/guptak/Self-review.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {

			try {
				Thread.sleep(10000);

				fileLength = _file.length();

			    if (fileLength < filePointer) {
			    	filePointer = fileLength;
                }
			    else if (filePointer < fileLength) {
					raf = new RandomAccessFile(_file, "rw");
					raf.seek(filePointer);

					String line = null;
					while ((line = raf.readLine()) != null) {
						System.out.println(line);
					}
					filePointer = raf.getFilePointer();
					raf.close();
				}

			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		Thread writeThread1=new Thread(new WriteThread());
		Thread writeThread2=new Thread(new WriteThread());
		Thread tail = new Thread(new Tail());
		tail.start();
		writeThread1.start();
		writeThread2.start();
		writeThread1.join();
		writeThread2.join();
		tail.join();
	}

}

class WriteThread implements Runnable {
	File _file = new File("/Users/guptak/Self-review.txt");

	@Override
	public void run() {
		BufferedWriter bw=null;
		try{
			bw=new BufferedWriter(new FileWriter(_file));
			int i=0;
			while(true){
				
				bw.write((Thread.currentThread().getName()+" "+"Line "+i)+System.getProperty("line.separator"));
				i++;
				bw.flush();
				Thread.sleep(5000);
			}
			
		}
		catch(Exception e){
			
		}finally{
		
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ConcurrentHashMap map;

	}
}
