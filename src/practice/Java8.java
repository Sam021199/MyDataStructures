package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Integer a=null;
//		System.out.println(a);
//		HashSet hs = new HashSet();
//		
//		hs.add("sam");
//		hs.add("sahaj");
//		hs.add("karan");
//		
//		System.out.println(hs);
		
//		HashMap<String,Integer> hm = new HashMap();
//		HashMap<String,Integer> hm1 = new HashMap();
//
//		hm.put("Sam",1);
//		hm.put("Sahaj",2);
//		
//		hm.forEach((k,v)->System.out.println(k+" " +v));
		
	//	System.out.println(hm);
		
//		if() {
//		System.out.println(hm);
//		}
//		
//		else {
//			System.out.println("No key present");
//		}
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(34);
		l.add(3);
		l.add(46);
		l.add(24);
//		
//		
//		Iterator<Integer> itr = l.iterator();
//		
//		while(itr.hasNext()) {
//			int i=itr.next();
//			System.out.println(i);
//		}
		
		
		l.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
