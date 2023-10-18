package hashTable02;

import java.util.Enumeration;
import java.util.Hashtable;


public class MainA {
	public static void main(String[] args) {
		
        Hashtable<String, Integer> hashtable 
        	= new Hashtable<>();
 
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
 
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);
 
        hashtable.remove("B");
 
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}
