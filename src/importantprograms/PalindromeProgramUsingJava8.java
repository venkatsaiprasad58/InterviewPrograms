package importantprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PalindromeProgramUsingJava8 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Venu", "Ojas",  "Venu","madam",  "Ojas");
		

		 list.stream().filter(s->s.length()>4).findAny().get();
//
//		for (int i=0;i<list.size();i++) {
//			String str = list.get(i);
//
//			if (Stream.of((str + ",").split(",")).map(s -> new StringBuilder(s).reverse())
//					.anyMatch(s -> String.valueOf(s).equals(str))) {
//				System.out.println(str);
//			} 
//		
	}

}
