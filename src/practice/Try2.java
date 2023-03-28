package practice;

public class Try2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="sam";
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			rev=a+rev;
		}
	//	System.out.println(rev);
		
		if(rev.equals(str)) {
			System.out.println("Palin");
		}
		
	}

}
