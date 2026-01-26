package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Consumer : Only input no output

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c = (name) -> System.out.println(name +" "+ "Good Morning");
		c.accept("Shaikh");
		c.accept("Pathan");
		c.accept("Khazi");
		
		
		List<Integer> numbers = Arrays.asList(10,20,30);
		
		//we can print numbers using for loop
		//we can print numbers using for-each loop
		//we can print numbers using iterator 
		// we can print numbers using list iterator 
		
		numbers.forEach(i -> System.out.println(i)); // for-each method will take consumer as a input.
	}
	
	
}






