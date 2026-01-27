package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatchingOperations {
	
	// Matching Opearations are terminal operations. (We'll get results not a stream).
	// anyMatch(), allMatch(), noneMatch
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Maroof", "UK");
		Person p2 = new Person("Hanif", "India");
		Person p3 = new Person("Amjad", "Pakistan");
		Person p4 = new Person("Raheem", "UK");
		Person p5 = new Person("sameer", "India");
		
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
//		boolean status = persons.stream().anyMatch(p -> p.country.equals("India")); // atleast one match
		
//		System.out.println("At least one person from india ::  " + status);
		
		// If any person belongs to Uk then get the data.
		
//		Optional<Person> findFirst = persons.stream().filter(i-> i.country.equals("UK")).findFirst();
//		if(findFirst.isPresent()) 
//		{
//			System.out.println(findFirst.get());
//		}
		
		
		// we need all the records from UK. so need to used collectors.
//		List<Person> records = persons.stream().filter(i-> i.country.equals("UK")).collect(Collectors.toList());
//		System.out.println(records);
		
		
//		List<Person> indians = persons.stream().filter(i-> i.country.equals("India")).collect(Collectors.toList());
//		
//		
//		indians.forEach(i -> System.out.println(i));
//		
		
		
//		boolean status1 = persons.stream().allMatch(p -> p.country.equals("Pakistan"));
		
//		System.out.println("All are from pakistan :: " + status1);
		
//		boolean status2 = persons.stream().noneMatch(p -> p.country.equals("UK"));
//		
//		System.out.println("None of then from UK :: "+status2);
		
		
		// Q. Collect the name of a person who are belong to india and store into names collection.
		
		List<String> names = persons.stream().filter(i-> i.country.equals("India"))
						.map(i-> i.name)
						.collect(Collectors.toList());
		
		System.out.println(names);
	}

}


class Person
{
	String name;
	String country;
	
	
	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
	
	
	
}