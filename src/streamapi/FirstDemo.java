package streamapi;

import java.util.stream.Stream;

public class FirstDemo {

	public static void main(String[] args) {
		
//		Stream<Integer> of = Stream.of(66,32,45,12,20);
		
//		List<Integer> list = Arrays.asList(66,32,45,12,20);
		
//		 Java 7 Approach
//		for(int i:list) 
//		{
//			if(i>20) 
//			{
//				System.out.println(i);
//				
//			}
//		}
		
		
		// Using stream Java 8
		
//		Stream<Integer> stream = list.stream();
//		Stream<Integer> filter = stream.filter(i-> i > 20);
//		filter.forEach(i -> System.out.print(i + " ")); // filter is intermediate method.
		
		// More short way
//		list.stream().filter(i -> i>20).forEach(i -> System.out.println(i));
		
		
		
		
	
		
	}
}


