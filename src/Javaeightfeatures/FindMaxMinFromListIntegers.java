package Javaeightfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxMinFromListIntegers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 2, 3, 4, 5, 6, 12, 33, 66, 322, 99);

		int minElement = list.stream().min(Integer:: compareTo).get();
		
	//	System.out.println(minElement);
		
	//	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		//list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	

		//  list.stream().max(Comparator.nauralOrder()).get();

	}

}
