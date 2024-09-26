package importantprograms;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "madam";

		if (isPalindrome(str)) {
			System.out.println("Given Str is palindrome");
		} else {
			System.out.println("Given Str is not palindrome");
		}

	}

	public static boolean isPalindrome(String str) {

		int l = 0, r = str.length() - 1;

		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

}
