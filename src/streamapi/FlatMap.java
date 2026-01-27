package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		// Stream of stream then we used flatmap.
		
		List<String> backend = Arrays.asList("core java", "adv java","spring boot");
		
		List<String> ui = Arrays.asList("html", "css","js","bootstrap");
		
		List<List<String>> courses = Arrays.asList(backend, ui);
		
		
//		courses.stream().forEach(c -> System.out.println(c));
		
		
		// When we have more than one collection then we go for flatmap.
		
		
		Stream<String> flatMap = courses.stream().flatMap(i -> i.stream());
		
		flatMap.forEach(i -> System.out.println(i));
		
	}
}
