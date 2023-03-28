package practice;

public class Newprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=11;
		boolean flag=true;
		
		if(n==0 || n==1) {
			System.out.println("Not a prime");
		}
		
		if(n%2!=0 || n%n==1) {
			flag=true;
		}
		
		
	}

}
