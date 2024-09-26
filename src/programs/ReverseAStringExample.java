package programs;

public class ReverseAStringExample {

	public static void main(String[] args) {

		String str = "Ojas innovative technologies";
		String nstr = "";

		// StringBuilder string = new StringBuilder(str);

		// System.out.println(string.reverse());

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			nstr = c + nstr;
		}
		System.out.println(nstr);
	}
}
