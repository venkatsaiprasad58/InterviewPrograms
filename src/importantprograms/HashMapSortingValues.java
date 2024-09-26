package importantprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortingValues {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("Venu", 12);
		mp.put("Gopal", 14);
		mp.put("Ojas", 126);
		mp.put("Reddy", 120);
		mp.put("Technologies", 121);

		System.out.println(mp);

		for (Map.Entry<String, Integer> m : mp.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

		LinkedHashMap<String, Integer> collect = mp.entrySet().stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Checking again:" + collect);

//		for (String key : mp.keySet()) {
//            Integer value = mp.get(key);
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
//
//		LinkedHashMap<String, Integer> collect = mp.entrySet().stream()
//				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//		System.out.println(collect);
	}
}
