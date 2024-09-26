package Javaeightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

//		IntStream.range(1, 11).forEach(System.out::println);

		// System.out.println(IntStream.range(1, 11).sum());

		List<Integer> list1 = Arrays.asList(1, 3, 4, 21, 42, 10);

		IntStream.rangeClosed(3, list1.size()).forEach(System.out::println);

		// System.out.println(Arrays.toString(reversedArray));
	}
}
