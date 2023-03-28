package practice;

public class Checking extends Absss {

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 35.33437;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking c = new Checking();
		Absss s;
		s=c;
		double st=c.area();
		double result = c.areas();
		System.out.println(result);
		System.out.println(st);
	}

}
