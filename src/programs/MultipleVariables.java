package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MultipleVariables {

	public static void main(String[] args) {
		String[] stringArray = {"Hello", "World"};
		Integer[] intArray = {1, 2, 3};
		
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		System.out.println(li);
		
		Object[] array2 = li.toArray();
		for(Object arr : array2) {
			
		}

		Object[] array = Stream.concat(Arrays.stream(stringArray), Arrays.stream(intArray)).toArray();
	//	System.out.println(Arrays.toString(array));
		
		for(Object arr : array) {
			System.out.println(arr);
		}

	}

}
