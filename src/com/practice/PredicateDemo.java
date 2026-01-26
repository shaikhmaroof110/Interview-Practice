package com.practice;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

// Predicate is a predefined functional interface contain only one abstract method that test(argument), This test() return boolean value.



public class PredicateDemo {
	
//	public boolean test(int i) 
//	{
//		if(i>10) 
//		{
//			return true;
//		}
//		else 
//		{
//			return false;
//		}
//	}

	public static void main(String[] args) {
		
		// Task 1 :
		// Check number is greater than 10 or not.
		
//		Predicate<Integer> p = i -> i > 10;
//		System.out.println(p.test(15));
		
//		====================
//		 Task 2 :
//		 Declare names in an array and prints which are starting with "A" using Lamda Expression.
//		String names[] = { "Alia","Sania","sonia","Anushka","Pretty" };
//		
//		Predicate<String> p =name -> name.charAt(0)== 'A';
//		
//		for(String name:names) 
//		{
//			if(p.test(name)) 
//			{
//				System.out.println(name);
//			}		
//		}
//		========================
		
		
//		************BiPredicate **********
		
		BiPredicate<Integer, Integer> bp=(i,j)-> (i+j)>= 20;
		System.out.println(bp.test(2, 3));
		System.out.println(bp.test(21, 3));
		
//		It will take two inputs only not more than that.
		
		
		
		
	}
}
