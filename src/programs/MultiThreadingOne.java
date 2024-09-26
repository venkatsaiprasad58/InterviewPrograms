package programs;

public class MultiThreadingOne extends Thread {

	public static void main(String[] args) {
		MultiThreadingOne t = new MultiThreadingOne();
		t.start();

		System.out.println("one");

		t.start();

		System.out.println("two");
	}

	public void run() {
		System.out.println("Thread");
	}
}
