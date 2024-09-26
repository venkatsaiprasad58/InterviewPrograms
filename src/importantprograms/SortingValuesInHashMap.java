package importantprograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingValuesInHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);
		
	//	System.out.println(hm);
		
		//hm.entrySet().stream().sorted(
				
		
		
		LinkedHashMap<String, Integer> collect = hm.entrySet().stream().sorted((i1,i2)-> i1.getValue().compareTo(i1.getValue())).collect
				(Collectors.toMap(Map.Entry:: getKey, Map.Entry:: getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		collect.forEach((key, value) -> 
        System.out.println("Key = " + key + ", Value = " + value));
	}
}
