package practice;

public class Student {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher stud = new Teacher();
		System.out.println(stud);
		Student stud2 = new Teacher(2,"Sammy");
		System.out.println(stud2);
		
	}

}

class Teacher extends Student{
	private int id;
	private String name;
	
	
	Teacher(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Teacher(){
		this.id=10;
		this.name="Sam";
	}
	
	public String toString() {
		return "Student :ID= " + id +  " name= " + name;
	}
}