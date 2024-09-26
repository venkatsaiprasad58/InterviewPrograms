import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramClass {
	public static boolean checkAnagram(String str1, String str2) {
		List<String> list1 = Stream.of(str1.toLowerCase()).sorted().collect(Collectors.toList());
		List<String> list2 = Stream.of(str2.toLowerCase()).sorted().collect(Collectors.toList());
		System.out.println(list1 + " " +list2);
		return list1.equals(list2);
	}

	public static void main(String[] args) {

		String str1 = "cat";
		String str2 = "a";
		boolean b = checkAnagram(str1, str2);

		if (b) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not a anagram");
		}
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		 
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a anagram");
		}
	}

}
