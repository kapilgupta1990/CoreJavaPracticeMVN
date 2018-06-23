package com.cdk.gist.lang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ProcessTester {

	public static void main(String[] args) throws IOException, InterruptedException {
		 // create a new process
        System.out.println("Creating Process");
        String arr[]= new String[]{"open","/Applications/Sublime Text.app"};

        ProcessBuilder builder = new ProcessBuilder(arr);
        Process pro = builder.start();
        
     // checking the exit value of subprocess
        //System.out.println("exit value: " + pro.exitValue());
 
        // wait 10 seconds
        System.out.println("Waiting");
        Thread.sleep(10000);
        
//        OutputStream os=pro.getOutputStream();
//        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
//        bw.write("kapil");
//        bw.write("gupta");
//        bw.write("123");
//        bw.flush();
 
        // kill the process
      //  pro.destroy();
        
        BufferedReader is = 
                new BufferedReader(new InputStreamReader(pro.getInputStream()));
            String line;
             
            // reading the output
            while ((line = is.readLine()) != null){
            	System.out.println(line);
            }
        System.out.println("Process destroyed");
        
        
     // checking the exit value of subprocess
        //System.out.println("exit value: " + pro.exitValue());
	}
}
