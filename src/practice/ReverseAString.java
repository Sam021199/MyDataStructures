package practice;

public class ReverseAString {

	public static void main(String[] args) {

		String a="abcba";
		String b="sam";
		String c="sam";
		String reverse="";
		
		for(int i=a.length()-1;i>=0;i--) {
			reverse += a.charAt(i);
			System.out.println(reverse);
		}
		
		if(b==c) {
			System.out.println("ok");
		}
		
		boolean palindrome = true;
		for(int i=0;i < a.length()-1;i++) {
			if(a.charAt(i) != reverse.charAt(i)) {
				palindrome=false;
			}
		}
		
		if(palindrome) {
			System.out.println("Palindromee");
		}
		else {
			System.out.println("Not a pal");
		}
		
	}
}
