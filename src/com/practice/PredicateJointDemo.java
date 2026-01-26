package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//Task 
// Find the list of employees who belong to Pune location and working in Backend dept.


public class PredicateJointDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raju","Devops","Pune");
		Employee e2 = new Employee("Harun","Front End","Dubai");
		Employee e3 = new Employee("Maroof","Backend","Pune");
		Employee e4 = new Employee("Shaikh","DA","Banglore");
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1 = e-> e.Location.equals("Pune");
		Predicate<Employee> p2 = e-> e.Dept.equals("Backend");
		Predicate<Employee> p3 = e-> e.name.startsWith("S");
		
		//Predicate Joining
//		Predicate<Employee> p = p1.and(p2); // both condition should match
//		Predicate<Employee> p = p1.or(p2); // one condition should match
		
		
		Predicate<Employee> p = p1.or(p2).or(p3); 
		for(Employee e: employees) 
		{
			if(p.test(e)) 
			{
				System.out.println(e.name);
			}
		}
	}
}


class Employee
{
	String name;
	String Dept;
	String Location;
//	
	public Employee(String name, String dept, String location) {
		super();
		this.name = name;
		this.Dept = dept;
		this.Location = location;
	}
	
}
