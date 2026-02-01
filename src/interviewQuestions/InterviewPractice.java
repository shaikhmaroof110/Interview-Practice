package interviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class InterviewPractice {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		
	
//1. How many male and female employees are there in the organization ?
//		Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(e -> e.gender, Collectors.counting()));
//		System.out.println(map);

		
		
		//Map<String, Long> map1 = emps.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(map1);
//		
//
//2. Print the name of all departments in the organization ?
		
//		employeeList.stream()	
//					.map(d->d.department)
//					.distinct()
//					.forEach(name -> System.out.println(name));
//
//		emps.stream()
//			.map(Employee::getDepartment)
//			.distinct()
//			.forEach(name -> System.out.println(name));
//
//3. What is the average age of male and female employees ?
		
//		Map<String, Double> map = employeeList.stream()	
//					.collect(Collectors.groupingBy(g -> g.gender,Collectors.averagingDouble(g->g.age)));
//		System.out.println(map);
//
//		Map<String, Double> map = emps.stream()
//			.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//		System.out.println(map);
//	
//			
//
//4. Get the details of highest paid employee in the organization ?
//
//		Optional<Employee> optional = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(d->d.salary)));
//		
//		if(optional.isPresent()) 
//		{
//			System.out.println(optional.get());
//		}
		
		
		
//		Optional<Employee> optional = emps.stream()
//			.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//		
//		if(optional.isPresent()) {
//			Employee employee = optional.get();
//			System.out.println(employee);
//		}
//
//		
//
//5. Get the names of all employees who have joined after 2015 ?
		
//		employeeList.stream()
//					.filter(d->d.YearOfJoining > 2015)
//					.map(d -> d.name)
//					.forEach(name -> System.out.println(name));
					
		
		
//
//	       emps.stream()
//			.filter(e -> e.yearOfJoining > 2015)
//			.map(e -> e.name)
//			.forEach(name -> System.out.println(name));
//
//6. Count the number of employees in each department ?
		
//		
//		Map<String, Long> map = employeeList.stream()
//					.collect(Collectors.groupingBy(e->e.department, Collectors.counting()));
//		
//		System.out.println(map);
//
//		Map<String, Long> map = emps.stream()
//									.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//			System.out.println(map);
//
//7. What is the average salary of each department ?
//		
//		Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(d->d.department,Collectors.averagingDouble(d->d.salary)));
//		System.out.println(map);
		
		
		
//			Map<String, Double> map = emps.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//			System.out.println(map);
//
//8. Get the details of youngest male employee in the Development department ?
		
		// Lamda Expression Approach
//		Optional<Employee> optional = employeeList.stream()
//					.filter(d->d.gender.equals("Male") && d.department.equals("Development"))
//					.min(Comparator.comparing(d->d.age));
//		if(optional.isPresent()) 
//		{
//			System.out.println(optional.get());
//		}
//					
	// Method Reference  Approach
//	Optional<Employee> optional = emps.stream()
//			.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
//			.min(Comparator.comparing(Employee::getAge));
//		
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}
//
//9. Who has the most working experience in the organization ?
//		Optional<Employee> optional = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(d->d.YearOfJoining)));
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}
		
//
//		Optional<Employee> optional = emps.stream()
//			.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
//			
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}
//
//10. How many male and female employees are there in the Sales team ?
		
//		Map<String, Long> map = employeeList.stream()
//					.filter(d->d.department.equals("Sales"))
//					.collect(Collectors.groupingBy(d->d.gender, Collectors.counting()));
//		System.out.println(map);
//		
		
//		Map<String, Long> map = emps.stream()
//									.filter(e -> e.getDepartment().equals("Sales"))
//									.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//			
//		System.out.println(map);
//
//11.  What is the average salary of male and female employees ?
//		employeeList.stream()
//					.collect(Collectors.averagingDouble(salary));
		
//12.  Get the employee who is having 2nd Highest salary.
		
//		Optional<Employee> optional = employeeList.stream()
//			    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//			    .skip(1)
//			    .findFirst();
//
//			optional.ifPresent(System.out::println);

		
//13. List down the names of all employees in each department ?
//		employeeList.stream()
//	    .collect(Collectors.groupingBy(e -> e.getDepartment()))
//	    .forEach((dept, emps) -> {
//	        System.out.println("Department: " + dept);
//	        emps.forEach(e -> System.out.println("  " + e.getName()));
//	    });

//14.  What is the average salary and total salary of the whole organization ?
//		Double averageSalary = employeeList.stream()
//		        .collect(Collectors.averagingDouble(Employee::getSalary));
//
//		Double totalSalary = employeeList.stream()
//		        .collect(Collectors.summingDouble(Employee::getSalary));
//
//		System.out.println("Average Salary = " + averageSalary);
//		System.out.println("Total Salary = " + totalSalary);
//
//15.  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?
		
		
//		Map<Boolean, List<Employee>> map = employeeList.stream()
//		        .collect(Collectors.partitioningBy(e -> e.getAge() <= 25));
//
//		System.out.println("Employees age <= 25:");
//		map.get(true).forEach(System.out::println);
//
//		System.out.println("\nEmployees age > 25:");
//		map.get(false).forEach(System.out::println);
//
//16.  Who is the oldest employee in the organization?
		
		Optional<Employee> optional = employeeList.stream()
		        .max(Comparator.comparingInt(Employee::getAge));

		optional.ifPresent(e -> 
		    System.out.println("Oldest Employee: " + e.getAge())
		);

	}
}



class Employee
{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int YearOfJoining;
	double salary;
	
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getYearOfJoining() {
		return YearOfJoining;
	}


	public void setYearOfJoining(int yearOfJoining) {
		YearOfJoining = yearOfJoining;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		YearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", YearOfJoining=" + YearOfJoining + ", salary=" + salary + "]";
	}
	
}