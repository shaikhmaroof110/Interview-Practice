package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MappingOperations {

	public static void main(String[] args) {
		
//		List<String> names = Arrays.asList("India", "USA","Japan","UK", "Pakistan");
		
		// Convert all the names into uppercase characters.
		
		// Java 7 Approach
//		for(String name: names) 
//		{
//			System.out.println(name.toUpperCase());	
//		}
		
		// Using Java 8 stream. map() method
//		names.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.print(i + " "));
		
		// WAJP to get Length of each names. 
		
//		names.stream().map(i -> i.length()).forEach(i -> System.out.println(i));
		
		// WAJP print name with its length, which are strating with character A.
		
//		List<String> names = Arrays.asList("Ashok", "Raju","Rani","Akash", "Charles");
//		
//		names.stream().filter(i-> i.startsWith("A"))
//						.map(i -> i + " - "+ i.length())
//						.forEach(i -> System.out.println(i));
		
		
		//  WAJP to print name whose salary is greater or equal to 50000.
		
		// name, age
		Employee e = new Employee("Maroof", 29,120000);
		Employee e1 = new Employee("Rehan", 30,12000);
		Employee e2 = new Employee("Ameer", 29,110000);
		Employee e3 = new Employee("sameer", 22,10000);
		Employee e4 = new Employee("Harun", 36,170000);
		
		// Approach - 01
//		Stream<Employee> emp = Stream.of(e,e1,e2,e3,e4);
//					emp.filter(name -> name.salary > 50000)
//					.map(i-> i.name + " - "+i.age)
//					.forEach(i->System.out.println(i));
		
		
		// Approach - 02		
		Stream<Employee> emp = Stream.of(e,e1,e2,e3,e4);
		emp.filter(name -> name.salary > 50000)
		.forEach(i->System.out.println(i.name + " - "+ i.age));
					
					
		
		
		
	}
}



// WAJP to print whose salary is greater or equal to 50000.


class Employee 
{
	String name;
	int age;
	double salary;
	
	
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}