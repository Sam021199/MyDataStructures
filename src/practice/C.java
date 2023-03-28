package practice;

abstract class Runner {
abstract void run();
}

class C extends Runner {
	void run(){
		System.out.println("Runner wins the Championship");
		}

public static void main(String[] args) {
	Runner r = new C();
	r.run();
}
}

