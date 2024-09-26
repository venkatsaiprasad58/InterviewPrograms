package fourtyinterviewquestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindHighestAndLowestNumberInStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 2, 4, 6, 7, 8, 9, 1, 11);

		Integer integer = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer);
		
		Integer integer2 = list.stream().min(Comparator.comparing(Integer:: valueOf)).get();
		System.out.println(integer2);

	}

}
