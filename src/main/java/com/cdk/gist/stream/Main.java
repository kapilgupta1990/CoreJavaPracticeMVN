package com.cdk.gist.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.swing.tree.MutableTreeNode;

public class Main {



	public static void main(String[] args) {
		
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),

				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		Predicate<Dish> predicate=new Predicate<Dish>() {
			
			@Override
			public boolean test(Dish t) {
				return t.getCalories()==800;
			}
		};
		System.out.println(menu.stream().anyMatch(predicate));
		// With lambda
		System.out.println("Does any dish with calory : 800"+menu.stream().anyMatch((d)->{return d.getCalories()==800;}));
		System.out.println("Does any dish with calory : 600"+menu.stream().anyMatch((d)->{return d.getCalories()==600;}));
		// All match
		System.out.println(menu.stream().allMatch((d)->{return d.isVegetarian();}));
		
		// Get all dishes whose calories is more than 1000
		System.out.println(menu.stream().filter((d)->{return d.getCalories()>1000;}).count());
		
		//menu.stream().
		

	}
}
