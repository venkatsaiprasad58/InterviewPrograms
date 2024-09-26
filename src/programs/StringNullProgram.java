package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringNullProgram {

	public static void main(String[] args) {
//
//		String[] str = {"venu", "gopal", "reddy", null, null, "reddy", null, null, null, null};
		List<Integer> numbers = new ArrayList<>();
		int n = 10;
		String str1 = "";
		for(int i = 1 ; i <= n ; i++) {
			numbers.add(i);
		}
		String collect = numbers.stream().map(e->String.valueOf(e)).collect(Collectors.joining(","));
		System.out.println(collect);
//		for(int i = 1 ; i <= n ; i++) {
//			if(i == n)
//				str1 += i;
//			else
//				str1 += i+ ",";
//		}
//		System.out.println(str1);
//		String strObj = "Tech-M";

//		for (int i = str.length-1; i > 1; i--) {
//
//			if (str[i] == str[i - 1]) {
//				str[i - 1] = strObj;
//                 
//			}
//			if(str[i-1] != null && str[i-1]!=strObj) {
//				break;
//			}
//		}
//		for (String string : str) {
//			System.out.print(string+",");
//		}
	}

}
