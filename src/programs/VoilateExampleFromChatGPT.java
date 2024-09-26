package programs;

public class VoilateExampleFromChatGPT {

	private volatile int counter = 0;

	public void increment() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {
		VoilateExampleFromChatGPT sharedData = new VoilateExampleFromChatGPT();

		// Thread 1 increments the counter
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				sharedData.increment();
			}
		});

		// Thread 2 reads the counter
		Thread thread2 = new Thread(() -> {
			System.out.println("Counter before waiting: " + sharedData.getCounter());
			try {
				Thread.sleep(2000); // Wait for 2 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Counter after waiting: " + sharedData.getCounter());
		});

		thread1.start();
		thread2.start();
	}
}
