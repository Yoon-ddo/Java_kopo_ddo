package SaintSungJa;

/*
 * 생성자의 특징
 * 1. 클래스명과 동일하다.
 * 2. 반환형이 존재하지 않음.
 * 3. 디폴트 생성자 지원
 * 4. 오버로딩 지원
 * 5. 객체의 초기화 담당.
 */

public class Car {
	
	// 만약 생성자가 없으면 JVM이 생성자를 자동으로 만들어줌 -  default 생성자 : Car(){}
	Car(){
		System.out.println("Car() 생성자 호출");
	}
	
	Car(String s){
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car(int i, String s){
		System.out.println("Car(int, String) 생성자 호출");
	}
	
	
	// 일반 메소드 호출
	void constructor() { // 메소드를 대문자로 쓰면 경고를 하기도 한다.
		System.out.println("일반 메소드 Car() 호출...");
	}
	

}
