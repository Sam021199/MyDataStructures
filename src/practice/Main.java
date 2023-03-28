package practice;


public class Main {
    public static void main(String[] args) {

    	
    	try {
    		int arr[] = new int[10];
    		arr[10]=30/0;
    	}
    	catch(Exception e) {
    		System.out.println("Error");
    	}
    }
	
}