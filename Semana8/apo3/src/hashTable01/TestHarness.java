package hashTable01;

import java.util.Scanner;

public class TestHarness implements Runnable {
	
	final HashTable<String, String> hashtable;

	public TestHarness(HashTable<String, String> hashtable) {
		this.hashtable = hashtable;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String k = scanner.next();
			String v = null;
			if (k.contains("=")) {
				String[] split = k.split("\\=");
				k = split[0];
				v = split[1];
				System.out.println("k: "+k+" : "+"v: "+v);
			}
			if (v == null) {
				System.out.println("v: "+hashtable.get(k));
			} else {
				hashtable.put(k, v);
			}
		}
		scanner.close();
	}
	
	public static void main(String args[]) throws Exception {
		new TestHarness(new HashTable<String, String>()).run();
	}

}
