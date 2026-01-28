//package streamapi;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class GroupBy {
//
//	public static void main(String[] args) {
//		
//		Employee e1 = new Employee(1,"Shaikh",175000,"India");
//		Employee e2 = new Employee(2,"Rajan",85000,"Bhutan");
//		Employee e3 = new Employee(3,"Ashraf",75000,"Pakistan");
//		Employee e4 = new Employee(4,"Smith",45000,"Canada");
//		Employee e5 = new Employee(5,"Lewis",57000,"Germany");
//		Employee e6 = new Employee(6,"Rocky",275000,"India");
//		
//		
//		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
//		
//		Map<String, List<Employee>> data = list.stream()
//		.collect(Collectors.groupingBy(e->e.country));
//		System.out.println(data);
//		
//		// Output :: Categorizing the data.
//		// {Canada=[Employee [id=1, name=Smith, salary=45000.0, country=Canada]], USA=[Employee [id=1, name=Rocky, salary=275000.0, country=USA]], Bhutan=[Employee [id=1, name=Rajan, salary=85000.0, country=Bhutan]], Pakistan=[Employee [id=1, name=Ashraf, salary=75000.0, country=Pakistan]], Germany=[Employee [id=1, name=Lewis, salary=57000.0, country=Germany]], India=[Employee [id=1, name=Shaikh, salary=175000.0, country=India]]}
//// Whenever we do grouping then that grouping element will act as a key. here based on country we are grouping/
//		
//		
//		
//		
//		
//	}
//}
//
//
//
//class Employee 
//{
//	int id;
//	String name;
//	double salary;
//	String country;
//	public Employee(int id, String name, double salary, String country) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.country = country;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
//	}
//	
//	
//	
//	
//	
//	
//}