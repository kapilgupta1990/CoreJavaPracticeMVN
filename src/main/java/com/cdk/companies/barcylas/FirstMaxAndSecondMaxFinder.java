package com.cdk.companies.barcylas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstMaxAndSecondMaxFinder {
	public static void main(String[] args) {

		int cost1, cost2, cost3;
		cost1 = 10;
		cost2 = 7;
		cost3 = 11;

		List<Integer> intList = Arrays.asList(cost1, cost2, cost3);
		Collections.sort(intList);
		int firstmax;
		int secondMax;

		if (cost1 > cost2) {
			firstmax = cost1;
			secondMax = cost2;
		} else {
			firstmax = cost2;
			secondMax = cost1;
		}

		// firstMax=5
		// SecondMax=2 // cost3=1

		if (firstmax < cost3) {
			secondMax = firstmax; // secondMax=5
			firstmax = cost3; // FirstMax=10
			// secondMax=

		} else {

			if (secondMax < cost3) {
				secondMax = cost3;
			}
		}

		System.out.println(firstmax + " " + secondMax);

	}
}
