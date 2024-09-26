package Javaeightfeatures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsInList {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 3, 4, 21, 42, 1);
		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		list1.stream().filter(each -> list2.contains(each)).forEach(System.out::println);

		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(1);
		set1.add(3);

		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(22);
		set2.add(12);
		set2.add(3);

		// set1.addAll(set2);

		// System.out.println(set1);

		Set set = new LinkedHashSet<>();

		list1.stream().filter(each -> !set.add(each)).forEach(System.out::println);

		// set2.stream().filter(e -> !set1.add(e)).forEach(System.out::println);

	}

}
