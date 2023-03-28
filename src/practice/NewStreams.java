package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStreams {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(11,02,30,14,25);
//		System.out.println(l);
//		l.forEach(n -> System.out.println("First "+n));
//		l.forEach(n -> System.out.println("Second "+n));

//		List<Integer> st = l.stream()
//				.forEach(n -> System.out.println(n));
//		Stream<Integer> newSt = l.stream();
//     	st.forEach(n -> System.out.println("Stream first: "+n));
//		System.out.println(st.count());
//		Stream<Integer> count = newSt.sorted();
//		count.forEach(n -> System.out.println(n));
		         l.stream()
				.filter(n->n%2==0)
				.forEach(n -> System.out.println(n));
		

	}

}
