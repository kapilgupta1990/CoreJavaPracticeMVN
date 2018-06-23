package com.cdk.companies.ubs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.ready());

		br.readLine();
		br.readLine();
		br.readLine();
		br.readLine();
		while (br.ready()) {
			System.out.println(br.readLine());
		}

	}
}
