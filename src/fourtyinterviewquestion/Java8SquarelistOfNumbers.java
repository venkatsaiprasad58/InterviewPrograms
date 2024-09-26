package fourtyinterviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

//Write a Java 8 program to square the list of numbers and then filter
//out the numbers greater than 100 and then find the average of the remaining numbers?
public class Java8SquarelistOfNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,200);

//		List<Integer> collect = list.stream().map(x -> x * x).filter(x -> x > 100).collect(Collectors.toList());
//		System.out.println(collect);

		OptionalDouble average = list.stream().map(x -> x * x).filter(x -> x < 100).mapToInt(Integer::intValue)
				.average();

		System.out.println(average.getAsDouble());
	}

}
