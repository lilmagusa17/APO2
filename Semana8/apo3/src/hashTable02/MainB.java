package hashTable02;

import java.util.*;

public class MainB {
	
	public static void main(String args[])
    {
        Hashtable<Integer, String> ht1 
        	= new Hashtable<>();
 
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>();
 
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
 
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
  
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
        
        for (Map.Entry<Integer, String> e : ht1.entrySet())
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }

}
