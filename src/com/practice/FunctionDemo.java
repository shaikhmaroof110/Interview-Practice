package com.practice;

import java.util.function.BiFunction;

public class FunctionDemo {
	

	//Retrieve student record based on student id and return record.
	
	public static void main(String[] args) {
		
//		Function<String,Integer> f = (name) -> name.length();
//		System.out.println(f.apply("sameer"));
//		System.out.println(f.apply("Hyderabad"));
//		System.out.println(f.apply("Delhi"));
//		
		
		BiFunction<Integer,Integer,Integer> bi= (a,b)-> (a+b);
		System.out.println(bi.apply(10, 20));
	}

}
