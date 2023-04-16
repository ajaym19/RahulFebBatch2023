package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TraverstingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(12);
		list.add(23);
		list.add(23);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//for each/enhanced for loop
		System.out.println("Using for each");
		for(Integer a : list) {
			System.out.println(a);
		}
		
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(17);
		set.add(23);
		set.add(112);
		System.out.println(set);
		for (Integer abc : set) {
			System.out.println(abc);
		}
		
		
		Iterator<Integer> it = set.iterator();
		//hasnext
		//next
		System.out.println("Printing using Iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}
}
