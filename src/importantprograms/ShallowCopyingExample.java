package importantprograms;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyingExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Venu");
		list.add("Gopal");
		list.add("Reddy");
		
		 ArrayList<String> shallowCopy = (ArrayList<String>) (((ArrayList<String>) list).clone());
		 
		 System.out.println("Original List: " + list);
	     System.out.println("Shallow Copy: " + shallowCopy);

	        // Modifying the original list
	        list.add("Cherry");

	        System.out.println("After modifying the original list:");
	        System.out.println("Original List: " + list);
	        System.out.println("Shallow Copy: " + shallowCopy);

	}

}
