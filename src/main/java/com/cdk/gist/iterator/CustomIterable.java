package com.cdk.gist.iterator;

import java.util.Iterator;

import com.cdk.gist.serialization.Employee;

public class CustomIterable<T> implements Iterable<T> {

	T[] object;
	int evenIndex = 0;
	int oddIndex = 1;

	public CustomIterable(T[] object) {
		this.object = object;

	}

	@Override
	public Iterator<T> iterator() {
		return new CustomIterator(new CustomOddIterator(), new CustomEvenIterator());
	}

	class CustomIterator implements Iterator<T> {

		private CustomOddIterator customOddIterator;
		private CustomEvenIterator customEvenIterator;

		public CustomIterator(CustomOddIterator customOddIterator, CustomEvenIterator customEvenIterator) {
			this.customOddIterator = customOddIterator;
			this.customEvenIterator = customEvenIterator;
		}

		@Override
		public boolean hasNext() {
			return customOddIterator.hasNext() == true ? true : customEvenIterator.hasNext();
		}

		@Override
		public T next() {
			try {
				return customOddIterator.next();
			} catch (Exception e) {
				return customEvenIterator.next();
			}

		}

	}

	class CustomOddIterator implements Iterator<T> {

		@Override
		public boolean hasNext() {

			return oddIndex < object.length;

		}
		

		@Override
		public  T next() {

			if (hasNext()) {
				T returnedEmployee = object[oddIndex];
				oddIndex = oddIndex + 2;
				return returnedEmployee;
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}
		}
	}

	class CustomEvenIterator implements Iterator<Object> {

		@Override
		public boolean hasNext() {

			return evenIndex < object.length;

		}

		@Override
		public T next() {

			if (hasNext()) {
				T returnedEmployee = object[evenIndex];
				evenIndex = evenIndex + 2;
				return returnedEmployee;
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}
		}
	}

	public static void main(String[] args) {

		Employee[] employees = new Employee[4];
		employees[0] = new Employee("1", 1);
		employees[1] = new Employee("2", 2);
		employees[2] = new Employee("3", 3);
		employees[3] = new Employee("4", 4);

		CustomIterable<Employee> iterable = new CustomIterable(employees);
		
//		Iterator<Employee> iterator = iterable.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		for(Employee employee:iterable){
			System.out.println(employee);
		}
		
		
		

	}
}
