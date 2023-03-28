package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sahaj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime=true;
	int year=4;
	if(year==0 || year==1) {
		isPrime=false;
	}
	
	for(int i=2;i<year;i++) {
		if(year%i==0) {
			isPrime=false;
			break;
		}
	}
	
	if(isPrime) {
		System.out.println("Prime num");
	}else {
		System.out.println("Not a prime");
	}
	
		
	}

}
