package practice;

public class Overloading {
	
	public static void main(String[] args) {
		long res=add(2,3);
		int res1=add(2,1);
		System.out.println(res);
		System.out.println(res1);
	}

	  
		static int add(int a,int b){
			return a+b;
			}  
		static long add(long a,long b){
			return a+b;
			}  
		
	
}
