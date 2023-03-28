package practice;

import java.util.*;

public class Lambdas {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("3");
		l.add("4");
		l.add("7");
		l.add("Sam");
		l.add("1");
		l.forEach((n)->System.out.println(n=="Sam" || n=="1"));
	}

}
