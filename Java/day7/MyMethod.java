package Method;

/*
 * 메소드 오버로딩(Overloading)
 - 같은 클래스 내에서 동명의 메소드이면서 매개변수의 개수 또는 타입이 다른
 - 메소드 이름은 같지만 메소드 매개변수와 그 타입이 다른 경우
 - 
 *
 */

public class MyMethod {
	
	void call() {
		System.out.println("call() 메소드 호출...");
		// 실행하려면 인스턴스 객체 생성 
	}
	
	void call(int i) { // 오버로딩으로 인해 위 call메소드와 다른 것으로 인식됨.
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) { // 오버로딩으로 인해 위 call메소드와 다른 것으로 인식됨.
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(String s) { // 오버로딩으로 인해 위 call메소드와 다른 것으로 인식됨.
		System.out.println("call(String) 메소드 호출...");
	}
	/*
	void call(char c) { // 오버로딩으로 인해 위 call메소드와 다른 것으로 인식됨.
		System.out.println("call(char) 메소드 호출...");
	}*/
	
	void call(String s, boolean b) {
		System.out.println("call(String, boolean) 메소드 출력");
	}
	
	
	
}






