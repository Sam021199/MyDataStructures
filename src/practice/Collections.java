package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		
//		Set<Integer> s = new TreeSet<>();
//		s.add(3);
//		s.add(2);
//		s.add(5);
//		s.add(1);
//		s.add(3);
//		s.add(0);
//		
//		System.out.println(s);
		
		
//		Set<Integer> s = new LinkedHashSet<>();
//		s.add(3);
//		s.add(2);
//		s.add(5);
//		s.add(1);
//		s.add(3);
//		s.add(0);
//		
//		System.out.println(s);
		
//		HashSet<Integer> hset = new HashSet<>();
//		hset.add(2);
//		hset.add(1);
//		hset.add(3);
//		System.out.println(hset);
		
//		Set<Integer> set = new HashSet<>();
//		set.add(4);
//		set.add(5);
//		set.add(6);
//		set.add(2);
//		
//		System.out.println(set);
		
//		List<String> list = new ArrayList<>();
//		list.add("Hello");
//		list.add("Okay");
//		list.add("Bye");
//		
//		System.out.println(list);
//		
//		List<String> list1 = new LinkedList<>();
//		list1.add("Sam");
//		list1.add("Jon");
//		list1.add("Ron");
//		
//		System.out.println(list1);
		
//		List<Integer> l = new ArrayList<>();
//		l.add(4);
//		l.add(2);
//		l.add(3);
//		
//		System.out.println(l);
		
		Map<String,String> map = new HashMap<>();
		map.put("Footballer","Ronaldo");
		map.put("Footballer","Messi");
		map.put("Footballer","Neymar");
		map.put("Cricketer","Kohli");
		
		
		for(String key:map.values())
	map.forEach((k,v)->System.out.println(k+""+v));
		
//		String s = map.get("Footballer");
//		String s1 = map.get("Cricketer");
//
//		System.out.println(map);
//		System.out.println(s);
//		System.out.println(s1);
//		
	}

}
