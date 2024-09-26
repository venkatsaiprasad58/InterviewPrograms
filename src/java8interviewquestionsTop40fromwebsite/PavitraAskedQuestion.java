package java8interviewquestionsTop40fromwebsite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PavitraAskedQuestion {

	public static void main(String[] args) {

		Map<String, ArrayList<Integer>> map = new HashMap<>();

		List<Integer> li = new ArrayList<>();
		li.add(12);
		li.add(13);
		
		map.put("list", (ArrayList<Integer>) li);
		
		System.out.println(map.get("list"));
		
		

	}

}
