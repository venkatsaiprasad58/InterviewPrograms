package Javaeightfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// How do you find the most repeated element in an array?
public class MostRepatedElementInArray {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(12, 33, 42, 49, 99, 2, 33, 1, 99, 98, 100, 99);

		Map<Integer, Long> collect = li.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(2).skip(1)
				.forEach(System.out::println);

		 System.out.println(collect);
	}

}
