package Javaeightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given an integer array, find sum and average of all elements?
public class SumOfElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 4, 2, 4, 2, 4, 4, 332);

		// Double d = list.stream().collect(Collectors.averagingInt(n -> n));

		// Double d = list.stream().collect(Collectors.averagingDouble(Integer::
		// valueOf));

//		DecimalFormat df = new DecimalFormat("#.###");

		// System.out.printf("%.3f",list.stream().collect(Collectors.averagingDouble(Integer::
		// valueOf)));

		Integer  sum  = list.stream().collect(Collectors.summingInt(Integer::valueOf));
		System.out.println(sum);
	}
}
