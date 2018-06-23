package com.cdk.gist.ecxeption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResourceTester {
	public static void oldApproach(Path path1, Path path2) throws IOException {
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = Files.newBufferedReader(path1);
			out = Files.newBufferedWriter(path2);
			out.write(in.readLine());
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

	public static void newApproach(Path path1, Path path2) throws IOException {
		try (
				BufferedReader in = Files.newBufferedReader(path1); 
				BufferedWriter out = Files.newBufferedWriter(path2);
				) {
			out.write(in.readLine());

		}
	}

	public static void customApproach() throws IOException {
		try (CustomeClosableInterface custom = new CustomeClosableInterface()) {
			custom.init();

		}
	}

	public static void main(String[] args) throws IOException {
		customApproach();
	}
}
