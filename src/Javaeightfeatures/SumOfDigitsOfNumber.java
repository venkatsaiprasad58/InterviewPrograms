package Javaeightfeatures;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find sum of all digits of a number in Java 8?
public class SumOfDigitsOfNumber {

	public static void main(String[] args) {

		int variable = 8080;

		double x = Stream.of(String.valueOf(variable).split(""))
				.collect(Collectors.summarizingDouble(Integer::parseInt)).getAverage();

		System.out.println(x);

	}

}
