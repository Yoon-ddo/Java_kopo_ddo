package ExceptionStudy;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		Random r = new Random();
		String str = null;
		
		
		
		try {
			System.out.println("첫번째 문자 : "+str.charAt(0));
			int num = r.nextInt(3);
			System.out.println("num : "+num);
			System.out.println(10/num); // 0이 되는 순간 예외가 발생.
	
		} catch(ArithmeticException ae){ 
			
			// (ArithmeticException ae) : 10/0 에러 발생시 catch에서 처리할게
			// (NullPointerException ae) : NullPoint 에러 발생시 catch에서 처리 -> 10/0 에러 해결 못하고 시스템 꺼짐.
			System.out.println("5252 catch만 믿으라구~");
			
			// 예외메시지 출력1
			System.out.println("원인 : "+ae.getMessage());
			// 예외메시지 출력2 : 어느줄에서 무슨 에러 발생했는지 다 알려줌.
			ae.printStackTrace(); // 간혹 main end...메시지랑 겹쳐보이는 경우가 있는데 무시해도 괜찮다.
			/*
			 * java.lang.ArithmeticException: / by zero
					main end...
								at ExceptionStudy.ExceptionMain02.main(ExceptionMain02.java:17)
			 */

		} catch(NullPointerException ae) { // catch는 2개도 쓸 수 있다.(multi catch문장)
			System.out.println("Null Pointer Exception");
		} 
		/*두개의 catch를 하나로 줄여쓸 수도 있다. catch(ArithmeticException | NullPointerException e)  { e.printStackTrace(); }
		* 모든 얘외를 섭렵하고 싶으면 catch(Exception e) 쓰면 무적이다.(묵시적 형변환) Exception안에 다양한 에러들이 포함되어있다.
		*/
		System.out.println("main end...");
		


	}

}