package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ParallelStream {
	
	public static void main(String[] args) {
//		System.out.println("===========Serial Stream ==========");
//		
//		Stream<Integer> ss = Stream.of(1,2,3,4,5,7);
//		ss.forEach(i -> System.out.println(i+ " :: " + Thread.currentThread()));
//		
//		System.out.println("===========Parallel Stream ==========");
//		
//		Stream<Integer> ps = Stream.of(1,2,3,4,5);
//		ps.parallel().forEach(n->System.out.println(n + " :: " + Thread.currentThread()));
	
	
	
//	=========SplItearator ====
		
		
		List<String> list = Arrays.asList("sachin","sameer","Govind");
		Spliterator<String> spliterator = list.stream().spliterator();
		spliterator.forEachRemaining(n -> System.out.println(n));
	
	}

}
