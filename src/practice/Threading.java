package practice;

public class Threading  {

//	public void run() {
//		System.out.println("In thread");
//	}
//	
//	public static void main(String[] args) {
//
//		Threading t1 = new Threading();
//		Threading t2 = new Threading();
//		Threading t3 = new Threading();
//		t1.start();
//		t2.start();
//		t3.start();
	
	String name;
	int height;
		
	public static void main(String[] args) {
			
			Threading t = new Threading();
		t.display();
			 
		}
	
	void display() {
		System.out.println(name+" "+height);
	}
		
//		Threading(String name,int height) {
//			this.name=name;
//			this.height=height;
//		}
		
		Threading(){
			name="Sammy";
			height=6;
		}
		
	
}


		