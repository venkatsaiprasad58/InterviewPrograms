package Javaeightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListofEvenAndOddUsingJava8 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 2, 4, 5, 9, 6, 7, 8);

		List<Integer> even = list.stream().filter(each -> each % 2 == 0).collect(Collectors.toList());

		System.out.println(even);

		List<Integer> odd = list.stream().filter(each -> each % 2 != 0).collect(Collectors.toList());

		System.out.println(odd);

	}

}
