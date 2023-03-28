package practice;

public class Enc{
	private int age;
	
	public void setAge(int age) {
		if(age>=0) {
			this.age=age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	
	public static void main(String[] args) {
		Enc e = new Enc();
		e.setAge(11);
		System.out.println(e.getAge());
		
	}
}