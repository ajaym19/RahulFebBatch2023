package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(23);
		list.add(11);
		list.add(121);
		list.add(121);
		list.add(null);
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		list.addFirst(201);
		list.addLast(501);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}
}
