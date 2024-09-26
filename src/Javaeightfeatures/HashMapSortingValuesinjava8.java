package Javaeightfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortingValuesinjava8 {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Venu", 29);
		hm.put("Gopal", 89);
		hm.put("Reddy", 2);
		hm.put("Ravi", 9);
		hm.put("Ojas", 67);
		// System.out.println(hm);

		List<Integer> list = Arrays.asList(1, 4, 5, 2, 5, 23, 121, 11);

		List<Integer> li = list.stream().sorted().toList();
		System.out.println(li);

		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list2);
		
		Integer integer = list.stream().min(Integer::compareTo).get();
		System.out.println(integer);
		
		

		LinkedHashMap<String, Integer> collect = hm.entrySet().stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(collect);

//		
//		LinkedHashMap<String, Integer> collect = hm.entrySet().stream().sorted((i1,i2)-> i1.getValue().compareTo(i2.getValue()))
//		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));

//		System.out.println(collect);

	}

}
