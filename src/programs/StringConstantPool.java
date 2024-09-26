package programs;

public class StringConstantPool {

	public static void main(String[] args) {
	
		String str1 = "Kaj";
		String str2 = "Sam";
		String str3 = "Kaj";
		String str4 = new String("Kaj");
		String str5 = "KajSam";
		String str6 = str1 + str2;
		String str7 = str5;
		String str8 = new String("Sam").intern();
		
		System.out.println(str2==str8);
//		System.out.println(str5 == str6);
//		System.out.println(str5.equals(str6));
//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);
//		System.out.println(str1 == str4);
//		System.out.println(str1.equals(str4));
	}
}
