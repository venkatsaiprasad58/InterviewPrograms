package programs;

public class SingleTonExample {

	public static void main(String[] args) {
		
		SingleTonPratice one = SingleTonPratice.createSingleTon();
		SingleTonPratice two = SingleTonPratice.createSingleTon();
		
		System.out.println(one);
		System.out.println(two);

	}

}

class SingleTonPratice {
	
	static SingleTonPratice instance;
	
	
	private SingleTonPratice() {
		
	}
	
	static SingleTonPratice createSingleTon() {
		if(instance == null) {
		  instance =  new SingleTonPratice();
		}
		
		return instance;
	}
}
				  