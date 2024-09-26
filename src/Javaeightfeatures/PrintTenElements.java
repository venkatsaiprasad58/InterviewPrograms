package Javaeightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintTenElements {
	
	public static void main(String[] args) {
		
//		String s = "";
//		for (int i = 1; i <=10; i++) {
//			if(s.length()>0)
//				s+=",";
//			
//			s+=i;
//		}
//		  System.out.println(s);
//	}
		
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        
        String joinedString = listOfStrings.stream().collect(Collectors.joining(",8"));
         
        System.out.println(joinedString);
	}
   

}
