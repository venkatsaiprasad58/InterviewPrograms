package importantprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOccuranceProgram {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Venu", "Gopal", "Venu", "Ojas");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String listref : list) {
			if (map.containsKey(listref)) {
				map.put(listref, map.get(listref) + 1);
			} else {
				map.put(listref, 1);
			}
		}

		for (Map.Entry<String, Integer> ms : map.entrySet()) {
			System.out.println(ms.getKey() + ":" + ms.getValue());
		}
	}
}
