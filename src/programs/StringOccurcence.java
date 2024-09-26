package programs;

import java.util.HashMap;
import java.util.Map;

public class StringOccurcence {

	public static void main(String[] args) {

		String[] str = { "venu", "gopal", "ojas", "venu", "reddy", "venu" };
		
//		Map<String, Integer> map = new HashMap<>();
//        map.put("apple", 3);
//        map.put("banana", 2);
//        map.put("orange", 1);
//        
//        System.out.println(map.entrySet());

		Map<String, Integer> entry = new HashMap<String, Integer>();

		for (int i = 0; i < str.length; i++) {
			if (entry.containsKey(str[i])) {

				entry.put(str[i], entry.get(str[i]) + 1);
			} else {
				entry.put(str[i], 1);
			}

		}

		for (Map.Entry<String, Integer> retrive : entry.entrySet()) {
			System.out.println(retrive.getKey() + "::" + retrive.getValue());
		}

	}

}
