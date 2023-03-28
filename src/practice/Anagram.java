package practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="cat";
		String b="atb";
		String c="ctaa";
		
		a=a.toLowerCase();
		b=b.toLowerCase();
	
		
		if(a.length()==b.length()) {
			char[] a1=a.toCharArray();
			char[] b1=b.toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(b1);
			
			boolean res = Arrays.equals(a1, b1);
		
			
			if(res) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not anagram");
			}
			
		}else {
			System.out.println("Not anagram");
		}
		
		
		
		
	}

}
