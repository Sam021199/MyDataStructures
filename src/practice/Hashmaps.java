package practice;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<>();

		hm.put("Sam", 80);
		hm.put("Jon",40);
		hm.put("Ron",43);
		
		for(String name:hm.keySet()) {
			int per=hm.get(name);
			System.out.println(name + " " + per);
		}
	}

}
