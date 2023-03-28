package practice;

import java.util.Scanner;

public class Try3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isLeap=false;
		
		if(n%4==0) {
			if(n%100==0) {
				if(n%400==0) {
					isLeap=true;
				}
			}else {
				isLeap=true;
			}
		}
		
		if(isLeap) {
			System.out.println("leap");
		}
		
		
		
	}

}
