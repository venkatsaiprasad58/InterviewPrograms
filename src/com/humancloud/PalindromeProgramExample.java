package com.humancloud;

public class PalindromeProgramExample {

	public static void main(String[] args) {

		String str = "madams";
		String str1 = "";

		for (int i = 0; i <= str.length() - 1; i++) {
              char c =  str.charAt(i);
              str1 =  c+str1;
              System.out.println(str1);
		}
		if(str.equals(str1)) {
			System.out.println("Given String is palindrome");
		}
		else {
			System.out.println("not palindorme");
		}

	}

}
