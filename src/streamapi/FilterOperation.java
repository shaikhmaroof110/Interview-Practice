package streamapi;

import java.util.stream.Stream;

public class FilterOperation {

	public static void main(String[] args) {
// WAJP to  Print names starting with A.
		
//		List<String> names = Arrays.asList("John","Anushka","Anupama","Rafeeq","Smith", "Raju");
//		names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
		
		
		// Dealing with user class
		
		
		User u = new User("Anushka", 20);
		User u1 = new User("Rani", 35);
		User u2= new User("Raju", 15);
		User u3= new User("Charls", 34);
		User u4= new User("Smith", 25);
		User u5= new User("Ashok", 45);
		
		Stream<User> stream = Stream.of(u,u1,u2,u3,u4,u5);
//		stream.filter(i -> i.age > 18).forEach(i -> System.out.println(i));
		
//		Approach -01
//		stream.filter(i -> i.age >= 18 && i.name.startsWith("A")).forEach(i-> System.out.println(i));
		
//		Approach -02
		stream.filter(i -> i.age >= 18)
				.filter(i -> i.name.startsWith("A"))
		
				.forEach(i -> System.out.println(i));
	}
}





class User
{
	String name;
	int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
// toString method is used to print contain of the objects.
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}


