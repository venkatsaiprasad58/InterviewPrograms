package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeriesExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 2, 1, 3, 12, 44, 112, 11);

		int max = list.stream().max(Integer::compare).get();

		System.out.println(max);
		
		getFibonacciMatchedElements(max);

	}

	public static List<Integer> getFibonacciMatchedElements(int max) {

		List<Integer> listTwo = new ArrayList<>(Arrays.asList(0,1));
		
		int first = 0, second = 1, third = 0 ;
		
		while (third <= max) {
			third = first + second;
			if (third <= max) {
				listTwo.add(third);
				first = second;
				second = third;
			}
		}
		System.out.println(listTwo);
		return listTwo;
	}

}
