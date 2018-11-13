package com.cdk.gist.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Output1 {

	public void submitReports() throws InterruptedException, ExecutionException{
		ExecutorService service = Executors.newCachedThreadPool();
		Future bosses = service.submit(() -> System.out.print(""));
		Future bosses1 = service.submit(() -> {Thread.sleep(1000);System.out.println("Interrupted");Thread.sleep(10000);return 5;});
		service.shutdown();
		System.out.println(bosses.get());
		System.out.println(bosses1.get());
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		new Output1().submitReports();
	}
}
