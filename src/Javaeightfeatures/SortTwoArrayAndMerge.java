package Javaeightfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//How do you merge two unsorted arrays into single sorted array using Java 8 streams?
public class SortTwoArrayAndMerge {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 4, 8, 4, 21, 33, 12, 1);

		List<Integer> list2 = Arrays.asList(1, 19, 33, 242, 5343, 2453, 121);

//		list1.add(111);
//
//		System.out.println(list1);

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(5);
		lista.add(3);
		lista.add(9);
		lista.add(9);

		List<Integer> listb = new ArrayList<>();
		listb.add(1);
		listb.add(33);
		listb.add(3);
		listb.add(92);
		listb.add(99);

		lista.addAll(listb);

		Collections.sort(lista, Comparator.naturalOrder());

		System.out.println(lista);

//		String[] array1 = { "C", "B", "A" };
//		String[] array2 = { "D", "B", "F" };
//
//		String[] merge = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().distinct()
//				.toArray(String[]::new);
//
//		System.out.println(Arrays.toString(merge));
//
//		// Stream.concat(list1.stream(),
//		// list2.stream()).sorted().distinct().forEach(System.out::println);

	}

}
