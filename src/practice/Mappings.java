package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Mappings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashMap<String,Integer> hm = new HashMap<>();
//		
//		hm.put("Sam", 99);
//		hm.put("Jon",80);
//		hm.put("Ron",90);
//		hm.put("Sarah",88);
//		hm.put("Peter",96);
////		System.out.println("Before: " + hm);
//		
//		for(Map.Entry m : hm.entrySet()) {
//			System.out.println(m.getKey()+" : "+m.getValue());
//		}
		
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		lhm.put("Sam", 99);
		lhm.put("Jon",80);
		lhm.put("Ron",90);
		lhm.put("Sarah",88);
		lhm.put("Peter",96);
		
		for(Map.Entry l : lhm.entrySet()) {
			System.out.println(l.getKey()+" : "+l.getValue());
		}
		
		
		
	}

}
