package practice;

class College{
	private int rollNo;
	private String name;
	
	public void setRollNo(int r) {
		rollNo = r;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		College cg = new College();
		cg.setRollNo(3);
		System.out.println(cg.getRollNo());
		
		cg.setName("Sam");
		System.out.println(cg.getName());

	}

}
