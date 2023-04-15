package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	/*
	 * ArrayList:
	 * is a class implementing List Interface
	 * used to store multiple elements
	 * internally the structure is same as Array but with dynamic length or size
	 * 
	 * Rules:
	 * 1. All the elements are indexed
	 * 2. Insertion Order is maintained
	 * 3. Duplicate values are allowed
	 * 4. Null values are allowed
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//CRUD
		list.add(45);
		list.add(12);
		list.add(23);
		list.add(23);
		System.out.println(list);
		
		System.out.println(list.get(1)); //
		
		list.remove(1);
		System.out.println(list);
		
		list.set(0, 55);
		System.out.println(list);
		
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains(552));
		
		System.out.println(list.indexOf(23));
		
		System.out.println("Size of the List is ==> " + list.size());
		
		//add all the elements from list2 to list1
		
		//how to print or access all the elements 
		System.out.println("Printing all the elements using for loop");
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list.add(501);
		list.add(502);
		list.add(503);
		
		list.addAll(list2);
		System.out.println(list);
		
		list.add(1, 1001);
		System.out.println(list);
		
	}
}
