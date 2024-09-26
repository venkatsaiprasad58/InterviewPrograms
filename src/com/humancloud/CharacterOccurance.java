package com.humancloud;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurance {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "3", "5", "1", "1", "2");

		Map<String, Integer> mp = new HashMap<>();

		for (String listRef : list) {
			if (mp.containsKey(listRef)) {
				mp.put(listRef, mp.get(listRef) + 1);
			} else {
				mp.put(listRef, 1);
			}
		}

		for (Map.Entry<String, Integer> mpRef : mp.entrySet()) {
			System.out.println(mpRef);
		}

		int sum = 0;
		for (Map.Entry<String, Integer> mpRef : mp.entrySet()) {
			System.out.println(Integer.parseInt(mpRef.getKey()) * mpRef.getValue());
			sum += Integer.parseInt(mpRef.getKey()) * mpRef.getValue();
		}
		System.out.println(sum);
		
		long count = mp.entrySet().stream().collect(Collectors.summarizingInt(x -> x.getValue())).getSum();
		System.out.println("checking count:" + count);
		
	    

//		List<String> list = Arrays.asList("Venu", "Ojas", "Venu", "Pruthvi", "Venu", "Ojas");
//
//		Map<String, Integer> mp = new HashMap<String, Integer>();
//
//		for (String listRef : list) {
//			if (mp.containsKey(listRef)) {
//				mp.put(listRef, mp.get(listRef) + 1);
//			} else {
//				mp.put(listRef, 1);
//			}
//		}
//
//		for (Map.Entry<String, Integer> mpref : mp.entrySet()) {
//			System.out.println(mpref.getKey() + ":" + mpref.getValue());
//		}
//
//	}

	}

}
