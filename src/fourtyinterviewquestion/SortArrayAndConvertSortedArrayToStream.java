package fourtyinterviewquestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayAndConvertSortedArrayToStream {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Venu", "Gopal","Reddys", "Hello");
		
		List<String> collect = list.stream().sorted(Comparator.comparing(String::length)).filter(x -> x.length()>5).collect(Collectors.toList());

		System.out.println(collect);
		
		
//		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
//		System.out.println(sorted);
//		

	}

}
