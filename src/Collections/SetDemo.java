package Collections;

import java.util.HashSet;

public class SetDemo {

	/*
	 * Set:
	 * is a class implementing Set Interface
	 * 
	 * Rules:
	 * 1. No Insertion is maintained
	 * 2. we cannot use get and set
	 * 3. Duplicates are not allowed
	 * 
	 */
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(17);
		set.add(23);
		set.add(112);
		set.add(112);
		System.out.println(set);
		System.out.println(set.contains(23));
		set.remove(112);
		System.out.println(set);
		
		
	}
}
