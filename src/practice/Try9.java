package practice;

public class Try9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2022;
		boolean isLeap=false;
		
		if(n%4==0 && n%100!=0 || n%400==0) {
			System.out.println("a leap year");
		}
		
		else {
			System.out.println("Not a leap year");
		}
		
	}

}
