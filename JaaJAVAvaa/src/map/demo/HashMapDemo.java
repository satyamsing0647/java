package map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
* Auhtor : Satyam.3.Singh
* Date   : 6 Nov 2024
* Time   : 10:16:44 am
* Email  : satyam.3.singh@coforge.com
*/

public class HashMapDemo {
 
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm =new HashMap<Integer, String>();
		
		hm.put(111, "jhon");
		hm.put(222, "Jim");
		hm.put(333, "Mike");
		hm.put(null, "Jimmy");
		hm.put(null, "Jack");
		hm.put(444, null);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
