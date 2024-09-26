package programs;

import java.util.ArrayList;
import java.util.HashMap;

public class PavithraInterviewQuestionAsked {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		int c=1;
		HashMap<Integer,ArrayList> map = new HashMap<>();
		
		for (int i = 0; i < 10; i++) {
			arr.add(String.valueOf(i));
			if(arr.size()>0)
			{
				map.put(c, arr);
				System.out.println(map.entrySet());
				arr.clear();
				c++;
			}
			System.out.println(map.entrySet());
		}
	}

}
