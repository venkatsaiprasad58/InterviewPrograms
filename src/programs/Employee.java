package programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Venu");
		li.add("Gopal");
		li.add("Reddy");
		li.add("Ojas");

		// System.out.println("Printing list:" + li);

		List<String> toUp = li.stream().map(each -> each.toUpperCase()).collect(Collectors.toList());
		System.out.println("Printing toUpperCase:" + toUp);

		List<String> starts = li.stream().filter(each -> each.startsWith("G")).collect(Collectors.toList());
		System.out.println("Printing starsWith: " + starts);
		

		List<Integer> inte = new ArrayList<>();
		inte.add(1);
		inte.add(2);
		inte.add(5);
		inte.add(8);
		inte.add(10);

		System.out.println("Printing original integer List:" + inte);

		List<Integer> even = inte.stream().filter(each -> each % 2 == 0).collect(Collectors.toList());
		System.out.println("Printing even number List:" + even);

		List<Integer> multipy = inte.stream().map(each -> each * 2).collect(Collectors.toList());
		System.out.println("Printing multiply of 2 number:" + multipy);

		Optional<Integer> max = inte.stream().max(Comparator.naturalOrder());
		System.out.println("Printing max number:" + max);

		Optional<Integer> max1 = inte.stream().reduce(Integer::max);
		System.out.println("Printing max1 number from list:" + max1);

	}
}
