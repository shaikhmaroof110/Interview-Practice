package com.practice;

import java.util.ArrayList;
import java.util.Collections;

//WAJP to store numbers in ArrayList and sort numbers in descending order.

////Approach - 01
//
//public class NumbersSort1 {
//
//	public static void main(String[] args) {
//	
//		ArrayList al = new ArrayList();
//		al.add(6);
//		al.add(5);
//		al.add(15);
//		al.add(36);
//		al.add(28);
//		al.add(1);
//		System.out.println("Before Sort" + al);
//		Collections.sort(al, new NumberComparator());
//		System.out.println("After Sort" + al);
//		
//	}
//}
//
//
//class NumberComparator implements Comparator<Integer>
//{
//
//	@Override
//	public int compare(Integer i, Integer j) {
//		if(i>j) // If i is greater than j then don;t shift it .
//		{
//			return -1;
//			
//		}else if(i<j) // If i is less than j then shift it .
//		{
//			return 1;
//		}
//		return 0;
//	}
//	
//}


//Approach - 02  (With Lamda)

public class NumbersSort1 {

@SuppressWarnings("unchecked")
public static void main(String[] args) {

	ArrayList<Integer> al = new ArrayList();
	al.add(6);
	al.add(5);
	al.add(15);
	al.add(36);
	al.add(28);
	al.add(1);
	System.out.println("Before Sort" + al);
	
	
	Collections.sort(al, (i,j)-> i.compareTo(j)); // Ascending order

	
	Collections.sort(al, (i,j) -> (i > j) ? -1 : 1); // Descending order.
	
	System.out.println("After Sort" + al);
	
//	al.forEach(i -> System.out.print(i + " ")); Its available in iterable.
	
}
}

