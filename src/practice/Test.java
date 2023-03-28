package practice;

public abstract class Test {

	public abstract void add();
	
	public static void method2() {
		int a=3;
		int b=2;
		System.out.println(a+b);
	}

}


class FirstAbsClass extends Test{
	public static void main(String[] args) {
	
		int res;
		Test t;
		FirstAbsClass fb = new FirstAbsClass();
		t=fb;
		fb.method2();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=5;
		
	}
	
}