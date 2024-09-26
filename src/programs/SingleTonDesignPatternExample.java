package programs;

public class SingleTonDesignPatternExample {

	public static void main(String[] args) {

		Demo firstOne     = Demo.getInstance();
		Demo secondObject = Demo.getInstance();
		
		System.out.println(firstOne);
		System.out.println(secondObject);

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