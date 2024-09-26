package importantprograms;

public class PalindromeStringProgram {

	public static void main(String[] args) {

		String str = "madam";
		String reverse = "";

		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			 reverse = charAt + reverse;
		}
		if(str.equals(reverse)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
		

//		StringBuilder sb = new StringBuilder(str);
//		StringBuilder reverse = sb.reverse();
//
//		if (str.contains(reverse)) {
//			System.out.println("Given String is Palindrome :" + str);
//		} else {
//			System.out.println("Given String is not a Palindrome");
//		}

	}

}
