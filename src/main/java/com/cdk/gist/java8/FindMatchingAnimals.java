package com.cdk.gist.java8;

public class FindMatchingAnimals {

	private static void print(Animal animal, CheckTrait trait) {
			System.out.println(trait.test(animal));
	}
	private static int mStringLength(MyFunctionalInterface mfi,String str, int i){
		return mfi.doAnything(str, i);
	}

	public static void main(String[] args) {

		Animal animal1 = new Animal(false);
		Animal animal2 = new Animal(true);
		 CheckTrait ct = new CheckTrait() {
		
		 @Override
		 public boolean test(Animal a) {
		 return a.isCanHoop();
		 }
		 };
		 print(animal1,ct);
		 print(animal2,ct);
		 
		 print(animal2,abc->abc.isCanHoop());
		 print(animal2,(Animal a) -> { return a.isCanHoop(); });

		 //System.out.println(abc->abc.isCanHoop());
		// Writing same with lambda expression
		 int mLength=mStringLength((s, z) -> { return s.length()+z; },"mahesh",4);
		 System.out.println(mLength);
	}
}
