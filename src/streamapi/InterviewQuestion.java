package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestion {
	
	// WAJP to find Max, Min, Avg salary from given Employee data..
	
	
	public static void main(String[] args) {
//		Employee e = new Employee("Maroof", 1,120000);
//		Employee e1 = new Employee("Rehan", 2,12000);
//		Employee e2 = new Employee("Ameer", 3,110000);
//		Employee e3 = new Employee("sameer", 4,10000);
//		Employee e4 = new Employee("Harun", 5,170000);
//		
		
//		Stream<Employee> stream = Stream.of(e,e1,e2,e3,e4);
//		List<Employee> list = Arrays.asList(e,e1,e2,e3,e4);
//		
//		Optional<Employee> maxSalary = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(i->i.salary)));
//		if(maxSalary.isPresent()) 
//		{	
//			System.out.println("Maximum salary of Employee is :: "+ maxSalary.get().salary);
//		}
//		
//		Optional<Employee> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(i -> i.salary)));
//		if(minSalary.isPresent()) 
//		{	
//			System.out.println("Minimum salary of Employee is ::" + minSalary.get().salary);
//		}
//	
//		Double avgSalary = list.stream().collect(Collectors.averagingDouble(i->i.salary));
//			
//		System.out.println("avgSalary salary of Employee is ::" + avgSalary);
//	
		
	}
}


//
//
//class Employee 
//{
//	
//	String name;
//	int id;
//	double salary;
//	
//	
//	public Employee(String name, int id, double salary) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
//	}
//		
//}