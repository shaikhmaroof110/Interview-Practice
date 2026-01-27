package streamapi;

import java.util.Arrays;
import java.util.List;

public class SlicingOperation {
	
	
	// distinct(), limit(), skip() these are intermediate Operations

	public static void main(String[] args) {
		
		List<String> backend = Arrays.asList("core java", "adv java","spring boot","rest api","Microservices","AWS","core java");
		
		
		backend.stream().limit(2).forEach(i -> System.out.println(i)); // core java,adv java
		
		backend.stream().distinct().forEach(i -> System.out.println(i)); // unique record printed
		
		backend.stream().skip(2).forEach(i -> System.out.println(i)); // skip first 2 records
		
		
		
	}
}
