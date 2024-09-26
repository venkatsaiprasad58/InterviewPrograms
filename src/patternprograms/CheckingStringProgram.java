package patternprograms;

public class CheckingStringProgram {

	public static void main(String[] args) {
		String name = "VenuGopalReddy.ojas";
		int stringlength = name.length(); // 19
		String str = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == '.') {
				str = name.replace('.', '-');
			}
		}
		System.out.println(str);

	}

}
