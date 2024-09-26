package Javaeightfeatures;

import java.util.stream.IntStream;

// Print First ten even numbers
public class PrintFirstTenEvenNumbers {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 10).map(each -> each * 2).forEach(System.out::println);

	}

}
