package practice;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int num1=sc.nextInt();
		
		for(int i=num;i<=num1;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
