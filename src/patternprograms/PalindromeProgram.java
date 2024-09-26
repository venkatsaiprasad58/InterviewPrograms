package patternprograms;

public class PalindromeProgram {
	
	public static void main(String[] args) {
		String str = "MadaM";
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("printing str:"+str+" "+sb);
		
		if(str.contains(sb)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given String is not palindrome");
		}
	
	}
}
