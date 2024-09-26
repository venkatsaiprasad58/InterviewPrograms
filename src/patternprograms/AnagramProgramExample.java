package patternprograms;

import java.util.Arrays;
import java.util.Iterator;

public class AnagramProgramExample {

	public static void main(String[] args) {

		String s1 = "Ojas";
		String s2 = "ajOq";

		if (s1.length() != s2.length()) {
			System.out.println("not anagaram");
		} else {
			char[] charArrayS1 = s1.toCharArray();
			char[] charArrayS2 = s2.toCharArray();

			Arrays.sort(charArrayS1);
			Arrays.sort(charArrayS2);

			int count = 0;
			for (int i = 0; i < charArrayS1.length; i++) {
				if (charArrayS1[i] == charArrayS2[i]) {
					count++;
				}
			}
			if (count == s1.length()) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagaram");
			}
		}

	}

}
