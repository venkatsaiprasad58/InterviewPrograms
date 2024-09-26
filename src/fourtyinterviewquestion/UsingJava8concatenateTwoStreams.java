package fourtyinterviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingJava8concatenateTwoStreams {

	public static void main(String[] args) {

		List<Integer> listOne = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> listTwo = Arrays.asList(6, 7, 8, 9, 10);
		
		List<Integer> collect = Stream.concat(listOne.stream(), listTwo.stream()).collect(Collectors.toList());
		
		System.out.println(collect);
		
		

	}

}
