package com.cdk.gist.stream;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SqquentialAndParallelStream {

	public static void main(String[] args) {
		String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		System.out.println("Sequential Call===");
		run(Arrays.stream(strings));
		System.out.println("Parallel Call===");
		run(Arrays.stream(strings).parallel());
		
		
	}

	public static void run(Stream<String> stream) {

		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

}
