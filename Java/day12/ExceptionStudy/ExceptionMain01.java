package ExceptionStudy;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		Random r = new Random();
		
	
		int num = r.nextInt(3);
		System.out.println("num : "+num);
		System.out.println(10/num); // 0이 되는 순간 예외가 발생.
	
		System.out.println("main end...");

	}

}
