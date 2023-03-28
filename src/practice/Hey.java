package practice;

public class Hey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hey h = new Hey();
		int res=h.findSum(5);
		System.out.println(res);
	}
	
	public int findSum(int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+i;
		}
		
		return sum;
	}

}
