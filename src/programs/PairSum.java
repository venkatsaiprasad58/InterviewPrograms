package programs;

import java.util.ArrayList;
import java.util.List;

public class PairSum {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 5, 7,1,8, 21};
		List<String> list =new ArrayList<>();
		
		String pair = "";
		
		int key = 9;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i+1 ; j < arr.length ;j++) {
				if(arr[i] + arr[j] == key) {
					pair = "(" + arr[i] + "," + arr[j] + ")";
					list.add(pair);
				}				
			}
		}
		System.out.println(list);

	}
}
