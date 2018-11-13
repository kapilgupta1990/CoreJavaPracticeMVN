import java.util.Arrays;
import java.util.List;

public class FunctionwildCardTesting {

	public static void print(List<?> list) {

		System.out.println(list);
	}
	public static void print1(List<? extends Number> list) {

		System.out.println(list);
	}
	public static void print2(List<? super Number> list) {

		System.out.println(list);
	}

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> strList = Arrays.asList("11", "21", "33", "44", "55");
		List<Double> doubleList = Arrays.asList(1.0d, 2.0d);
		print(intList);
		print(strList);
		print(doubleList);
		
		
		//print1(strList);
		//print2(intList);
	}

}
