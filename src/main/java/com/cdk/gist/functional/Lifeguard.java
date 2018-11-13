package com.cdk.gist.functional;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

class Tourist {

}

public class Lifeguard {

	public void mfunction1(Supplier<Double> doubleSupplier) {
		System.out.println(doubleSupplier.get());
	}

	public void mfunction2(DoubleSupplier doubleSupplier) {

		System.out.println(doubleSupplier.getAsDouble());
	}

	public static void main(String[] args) {
		Lifeguard lg = new Lifeguard();
		lg.mfunction1(() -> 5.0);
		lg.mfunction2(() -> {
			return 4.0;
		});

		BiConsumer<Integer, Long> bi = new BiConsumer<Integer, Long>() {

			@Override
			public void accept(Integer t, Long u) {
				// TODO Auto-generated method stub

			}
		};
		BiFunction<Integer, Long, String> biFunction = new BiFunction<Integer, Long, String>() {

			@Override
			public String apply(Integer t, Long u) {
				// TODO Auto-generated method stub
				return null;
			}
		};

	}
}
