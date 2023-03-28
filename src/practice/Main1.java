package practice;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		Main1 m = new Main1();
		List<String> l1=m.viewDays();
		
//        for(String i : l1) {
//        	System.out.println(i);
//        }
		
		l1.forEach(i -> System.out.println(i));
        
		String num=m.numOfDay();
		if(num=="Seven") {
			System.out.println("Its a full week");
		}
		else {
			System.out.println("Holiday week");
		}
	}

	
	public List<String> viewDays() {
		List l = new ArrayList();
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Saturday");
		
		return l;
	}

	
	public String numOfDay() {
		return "Six";
	}

}
