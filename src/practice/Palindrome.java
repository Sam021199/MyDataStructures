package practice;

public class Palindrome {

	public static void main(String[] args) {

		String a="samas";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		//System.out.println(b);
		if(b.equals(a)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Pal");
		}
		
	}

}
