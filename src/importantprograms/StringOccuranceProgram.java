package importantprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOccuranceProgram {

	public static void main(String[] args) {

		
		List<String> list = Arrays.asList("Venu", "Ojas", "Hyderabad", "Venu", "Hello", "Ojas");
		
		list.stream().collect(Collectors.toSet()).stream().filter(x->x.length()>4).collect(Collectors.toMap(x->x, x->x.length())).forEach((K,V) ->System.out.println(K+" : "+V));;
		
//		list.stream().filter(x -> x.length()> 4).collect(Collectors.groupingBy(x -> x,Collectors.counting())).
//		forEach((K,V) ->System.out.println(K+" : "+V));

		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "TCS");
//		map.put(2, "CTS");
//		map.put(3, "Wipro");
//		map.put(4, "infosys");
//		
//		map.entrySet().stream().filter(x -> x.getValue().length()> 3).collect(Collectors.toMap(x -> x.getKey(), x-> x.getValue()))
//		.forEach((k,v)->System.out.println(k+":"+v));

		// list.stream().filter(x-> x.length()>3).collect(Collectors.toList()).stream().count();
		//System.out.println(collect);
		
	}
}
