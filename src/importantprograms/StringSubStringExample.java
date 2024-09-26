package importantprograms;

public class StringSubStringExample {
	
	public static void main(String[] args) {
		String str = "Harsha"; 
		int length = str.length();
		System.out.println(length);
		
		String substring = str.substring(1);
		System.out.println(substring);
		
		CharSequence subStringTwo = str.subSequence(1, 3);
		System.out.println(subStringTwo);
	}

}
