package practice;

public class Abcd {

	public static void main(String[] args) {
		
//		String str="sam";
//		String revStr="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			revStr += str.charAt(i);
//		}
//		
//		System.out.println(revStr);
		
//		String name="sayyam";
//		String nameRev="";
//		
//		for(char i=0;i<=name.length()-1;i++) {
//			char str=name.charAt(i);
//			nameRev=str+nameRev;
//		}
//		
//		System.out.println(nameRev);
		
		
		int num=39;
		boolean flag=true;
		
		if(num==1 || num==2) {
			flag=false;
		}
		
		else {
			 for (int i = 2; i <= num/2; i++) {
	                if (num % i == 0) {
	                    flag = false;
	                    break;
	                }
	            }
		
		if(flag) {
			System.out.println("Prime");
		}
		else {
			System.out.println("not prime");
		}

	}
	}
	}


