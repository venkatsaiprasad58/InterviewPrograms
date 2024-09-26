package Javaeightfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("Venu", "Gopal", "Reddy", "Ojas", "Google");

		List<String> list2 = Arrays.asList("Kurnool", "Kadapa", "Tirupati", "Chittor", "Ongole");

		List<String> list3 = Arrays.asList("KSRM", "College", "Office");

		List<List<String>> allLists2 = new ArrayList<>();

		allLists2.add(list1);
		allLists2.add(list2);
		allLists2.add(list3);

		System.out.println(allLists2);

		// List<List<String>> collect1 =
		// allLists2.stream().flatMap(Stream::of).collect(Collectors.toList());

		List<String> collect1 = allLists2.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
		System.out.println(collect1);

		// List<String> collect = allLists2.stream().flatMap(x ->
		// x.stream()).collect(Collectors.toList());

		// System.out.println(collect);

	}

}
