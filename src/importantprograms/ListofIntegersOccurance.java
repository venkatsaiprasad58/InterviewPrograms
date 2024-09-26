package importantprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ListofIntegersOccurance {

	public static void main(String[] args) {

		List<String> listOccurance = Arrays.asList("2", "1", "4", "6", "22", "2", "1");

		Map<String, Integer> mp = new HashMap<String, Integer>();

		for (String mlist : listOccurance) {
			if (mp.containsKey(mlist)) {
				mp.put(mlist, mp.get(mlist) + 1);
			} else {
				mp.put(mlist, 1);
			}
		}
		// mp.forEach((K, V) -> System.out.println(K + ": " + V));

		for (Entry<String, Integer> m : mp.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

		for (Entry<String, Integer> m : mp.entrySet()) {
			System.out.println(Integer.parseInt(m.getKey()) * m.getValue());
		}

		long count = mp.entrySet().stream().collect(Collectors.summarizingInt(x -> x.getValue())).getSum();
		System.out.println("checking count:" + count);
	}
}
