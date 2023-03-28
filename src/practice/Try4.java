package practice;

public class Try4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		boolean isPrime=true;
		
		if(n==0 || n==1) {
			isPrime=false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
			
		}

		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
		
	}

}
