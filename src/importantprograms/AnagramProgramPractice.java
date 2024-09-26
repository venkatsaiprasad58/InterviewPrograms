package importantprograms;

import java.util.Arrays;

public class AnagramProgramPractice {

	public static void main(String[] args) {
		String str = "Silent";
		String str1 = "liSten";

		if (str.length() != str1.length()) {
			System.out.println("Given String is not anagram!");
		} else {
			char[] charArray = str.toCharArray();
			char[] charArray2 = str1.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);

			int count  = 0;
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] == charArray2[i]) {
                    count++;
				}
			}
			if(count == str.length()) {
				System.out.println("Given String is anagram");
			}
			else {
				System.out.println("Given String is not anagram");
			}
		}
	}
}
