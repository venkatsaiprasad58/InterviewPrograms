package Javaeightfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//How do you sort the given list of decimals in reverse order
//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/
public class SortingJava8 {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 3, 2, 4, 5, 6, 7, 8, 9);

		List<Integer> reverseOrder = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(reverseOrder);

	}

}
