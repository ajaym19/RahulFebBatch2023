package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.InternalFrameUI;

public class HashMapDemo {

	/*
	 * HashMap
	 * is a class Implementing Map Interface
	 * 
	 * a key and value together is called as pair/bucket/entry
	 * multiple entries together is called as Entry Set
	 * 
	 * Elements are stored in key-value pair
	 * 1. Duplicate values are allowed
	 * 2. Multiple null values are also allowed
	 * 3. Duplicate key is not allowed, it will work as an Update
	 * 4. Only one null key is allowed, for second it will work as an update
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ajay");
		map.put(2, "Pooja");
		map.put(31, "Shweta");
		map.put(32, "Shweta");
		map.put(33, null);
		map.put(34, null);
		System.out.println(map);
		
		map.put(1, "Tom");
		map.put(null, "Harry");
		map.put(null, "Salman");
		System.out.println(map);
		
		System.out.println(map.containsKey(32));
		System.out.println(map.containsValue("Salman"));
		System.out.println(map.entrySet());
		System.out.println(map.get(2));
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		map.putIfAbsent(2, "Rocky");
		System.out.println(map);
		
		for(Map.Entry temp : map.entrySet()) {
			System.out.println("Key is ==> "+temp.getKey() + " Value is ==> "+temp.getValue());
			
		}
		
		
		
		
	}
}
