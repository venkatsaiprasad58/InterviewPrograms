package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OnlyFibonacciSeries {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("Anil","Venu","Pruthvi"));
		String finalString="";
		String finalString1="";
		
		System.out.println(list);
		
		for(String str : list) {
			if(!str.equalsIgnoreCase(list.get(list.size() - 1))) {	
				finalString += str+", ";
			} else			
				finalString += str+"";
			
			
			
			finalString1 += str+","; 
		}
		
		String join = String.join("," , list);
		System.out.println(join);
			
//		System.out.println(finalString);
//		System.out.println(finalString1.substring(0,finalString1.length()-1));
		
	}

}
