package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> l = Arrays.asList(5,4,2,1,7,9);
//		
//		List<Integer> even = l.stream()
//				.filter(n -> n%2==0)
//				.collect(Collectors.toList());
//		
//		System.out.println(even);
		
//		List<String> words = Arrays.asList("OK","Bye","Hello","Sky");
//		
//		List<String> threeLetWords = words.stream()
//				.filter(n -> n.length()==3)
//				.collect(Collectors.toList());
//		
//		System.out.println(threeLetWords);
		
//		List<Integer> l1 = Arrays.asList(5,3,21,1);
		
//		int sums = l1.stream()
//				.mapToInt(Integer::intValue)
//				.sum();
		
//		int sums=l1.stream()
//				.reduce(0,(a,b)->a+b);
//		
//		System.out.println(sums);
		
		List<Integer> l = Arrays.asList(2,4,6,8,9);
		
		List<Integer> res = l.stream()
				.filter(n-> n%2!=0)
				.collect(Collectors.toList());

		System.out.println(res);
		
		List<String> str = Arrays.asList("Ok","Hello","Bye");
		List<String> newStr = str.stream()
				.filter(n -> n=="Ok")
				.collect(Collectors.toList());
		
		System.out.println(newStr);
		
		
	}

}
