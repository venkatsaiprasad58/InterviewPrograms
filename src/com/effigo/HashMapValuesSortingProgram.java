package com.effigo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapValuesSortingProgram {
	
	public static void main(String[] args) {
		Map<Integer, Integer> mp = new HashMap<>();
		mp.put(1, 2);
		mp.put(2, 28);
		mp.put(3, 25);
		mp.put(4, 4);
		mp.put(5, 2);
		
		mp.entrySet().stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1,LinkedHashMap::new));
	}

}
