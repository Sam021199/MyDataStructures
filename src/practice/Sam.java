package practice;

public interface Sam {

	void name();
	default void showName() {
		
	}
	
	static void show() {
		System.out.println("Hi Sam!!!");
	}
}
