package practice;

import java.time.LocalDate;

public class Main2 implements Sam {

	public static void main(String[] args) {
		Sam.show();
		LocalDate l = LocalDate.now();
		System.out.println(l);
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

}
