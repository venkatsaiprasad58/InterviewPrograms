package fourtyinterviewquestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(10);
		list.add(12);
		list.add(2);
		System.out.println(list);
		Set<Integer> set = new HashSet<>();

		List<Integer> collect = list.stream().filter(x -> !set.add(x)).collect(Collectors.toList());
		System.out.println(collect);

//		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);

//		Set<Integer> xset = list.stream().filter(x-> x==x).collect(Collectors.toSet());
//		System.out.println(xset);

	}

}
