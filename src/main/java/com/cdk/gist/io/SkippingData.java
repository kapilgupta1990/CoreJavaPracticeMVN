package com.cdk.gist.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SkippingData {

	public static void main(String[] args) throws IOException {
		InputStream is=new FileInputStream(new File("/Users/guptak/tmp.txt"));
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.println();
		is.skip(3);
		//is.reset();
		System.out.println(is.markSupported());
		System.out.print((char)is.read());
		
	}
}
