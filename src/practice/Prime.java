package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Scanner sc = new Scanner(System.in);
//      int num=sc.nextInt();
//      boolean flag=true;
//      
//      for(int i=2;i<num/2;i++) {
//      if(num%i==0) {
//    	  flag=false;
//    	  break;
//      }
//      }
//      
//      
//      if(flag) {
//    	  System.out.println("Prime");
//      }
//      else {
//    	  System.out.println("Not prime");
		
//		String str="abcd";
//		String rev="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//		char a=str.charAt(i);
//		rev=rev+a;
//		}
//		
//		if(str.equals(rev)) {
//		System.out.println("Palin");
//		}else {
//			System.out.println("Not palin");
//		}
		
		int year=2004;
		
		if(year%400==0) {
			
			if(year%100==0) {
				if(year%4==0) {
					System.out.println("Leap year");
				}
			}
		}
		else {
			System.out.println("Not a leap year");
		}
		
		
      }
		
		
	}
	
	
