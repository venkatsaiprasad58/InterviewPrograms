package Javaeightfeatures;

public class PalindromeString {
    
    public static Boolean isPalindrome(String A) {
    	
    	 String alphaNumeric = "";
		for(Character ch : A.toCharArray()) {			
			if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) {
				alphaNumeric += ch; //dup = dup+ch;
			}			
		}
		StringBuilder sb = new StringBuilder(alphaNumeric);
		String reverse = sb.reverse().toString();
//		System.out.println(reverse);
//		System.out.println(A);
		
		if(reverse.equals(alphaNumeric)) {
//			System.out.println("'" + sb + "' is a Palindrome String");
			return true;
		}
		else {
//			System.out.println("'" + sb + "' is NOT a Palindrome String");
			return false;
		}
    }

	public static void main(String[] args) {		
		
		String str = "908A man, a plan, a canal: Panama8098".toLowerCase().replaceAll("\\s", "");
	    
	    Boolean isPalindrome = isPalindrome(str);
	    
	    if (isPalindrome)
	    	System.out.println("PALINDROME");
	    else
	    	System.out.println("NON PALINDROME");
		    
	}
	
}
