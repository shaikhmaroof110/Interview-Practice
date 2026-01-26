package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonDemo {

	// Task 3 :
	// Take a list of person, and print name whose age is greater than 18 using lamda.
	
	public static void main(String[] args) {
		Person p1 = new Person("John", 28);
		Person p2 = new Person("smith", 17);
		Person p3 = new Person("Ameer", 16);
		Person p4 = new Person("Sana", 18);
		Person p5 = new Person("Harun", 28);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		Predicate<Person> predicate =  p -> p.age >=18;
		for(Person person:persons) 
		{
			if(predicate.test(person)) 
			{
				System.out.println(person.name);
			}
			
		}
	}	
}


class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
}




