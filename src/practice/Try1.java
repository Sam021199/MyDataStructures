package practice;

import java.util.Scanner;

public class Try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur number: ");
		int n = sc.nextInt();
		boolean isPrime=true;
		
		if(n==0 || n==1) {
			isPrime=false;
		}
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(n);
		}else {
			System.out.println("Not a prime num");
		}
	}

}
