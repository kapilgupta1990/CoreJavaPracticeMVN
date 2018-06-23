package com.cdk.gist.ecxeption;

import java.io.Closeable;
import java.io.IOException;

public class CustomeClosableInterface implements Closeable {

	public void init(){
		System.out.println("Closing init closable interface");
	}
	@Override
	public void close() throws IOException {
		System.out.println("Closing custome closable interface");
		
	}

}
