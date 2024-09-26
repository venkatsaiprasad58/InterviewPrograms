package importantprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemoForHashMap {

	public static void main(String[] args) {

		Map<Object, String> mp = new WeakHashMap<Object, String>();
		Checking d = new Checking();
		mp.put(d, "Hi");
		System.out.println(mp);

		// d = null;

		System.gc();
		System.out.println(mp);

	}

}

class Checking {

	public String toString() {
		return "demo";
	}

	public void finalize() {

		System.out.println("Finialize method is called");
	}
	
	
}