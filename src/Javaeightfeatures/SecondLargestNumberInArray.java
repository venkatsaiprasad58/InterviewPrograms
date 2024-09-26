package Javaeightfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find second largest number in an integer array?
public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(21, 3, 1, 34, 11, 55, 21, 11, 4, 8, 1, 9, 1, 9, 55);

		 li.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);

//		Integer secondLargestNumber = li.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst()
//				.get();
//		
//		System.out.println(secondLargestNumber);
//		int xy = 44;
//		
//		String integer  = String.valueOf(xy);
//		
//		String integer1 = xy+"";
//		
//		System.out.println(integer);
//		System.out.println(integer1);
//		
//		String str = "222";
		
//		int x = Integer.parseInt(str);
//		
//		System.out.println(x);

	}
}
