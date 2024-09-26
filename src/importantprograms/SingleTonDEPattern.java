package importantprograms;

public class SingleTonDEPattern {

	public static void main(String[] args) {

		Demo d = Demo.getInstance();
		Demo d1 = Demo.getInstance();

		System.out.println(d);
		System.out.println(d1);
	}
}

class Demo {

	static Demo instance;

	private Demo() {
	}

	static Demo getInstance() {
		if (instance == null) {
			instance = new Demo();
		}
		return instance;
	}
}
