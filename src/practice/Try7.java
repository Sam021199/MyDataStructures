package practice;

public class Try7 {
	public static void main(String[] args) {
		
		String str="samas";
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			rev=a+rev;
		}
		
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("no");
		}
		
	}

}
