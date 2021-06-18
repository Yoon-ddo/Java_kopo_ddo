package ExceptionStudy;

import java.io.FileReader;

public class ExceptionMain02 {
	public static void main(String[] args) throws Exception { //  5) try catch도 귀찮으면 main메소드에 throw Exception을 붙여주면 main은 JVM에게 떠넘긴다. -> 좋은방법은 아뉨
																// -> 이거근데 언제 ㅆ? 추상화
		
		/*
		try {
			
			b(); // 1) 메인메소드가 b메소드 호출
		} catch( Exception e) { // 4) main의 catch블록이 b의 예외처리 수행
			System.out.println("main( ) 예외처리...");
			e.printStackTrace();
		}
		*/
		
		b();
		
		
		
		
		//a();
	}//m
	
	
	public static void a() {
		System.out.println("a( ) 메소드 호출...");
		try {
			FileReader fr = new FileReader("a.txt");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void b() throws Exception {  // 3) throws Exception을 적어주어 떠넘긴다.
		// throws Exception : b의 에러처리를 다른메소드(main)에 떠넘길래.
		System.out.println("b( ) 메소드 호출...");
		
		String str = null;
		System.out.println(str.charAt(0));
		System.out.println(1/0); //2) 예외발생(ArithmeticException). 근데 b가 예외처리 하기 귀찮아.
		
	}
	
	
	
	
	
	
	
	
	
	
}//c
