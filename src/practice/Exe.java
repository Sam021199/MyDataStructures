package practice;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s="";
			int len=s.length();
			System.out.println(len);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Thank you");
		}

	}

}
