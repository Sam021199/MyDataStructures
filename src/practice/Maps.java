package practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m = new HashMap<>();
		m.put(1, "Sam");
		m.put(2, "Sahaj");
		for(String res : m.values()) {
			System.out.println(res);
		}

	}

}
