package Method;
// 기능클래스

import java.util.Scanner;

/** 구구단과 관련된 여러가지 기능을 가지는 기능 클래스
 * 
 * @author da
 *
 */
public class GuGuDan { // 구구단과 관련된 메소드 모음집
	
	Scanner sc = new Scanner(System.in); // sc에 메소드가 접근할 수 있다!

		
	void print (int dan) {
		System.out.println("*** "+ dan + "  단***");
		for(int i =1; i<=9 ; i++) {
		
			System.out.println(dan+" * "+i +" = "  +(dan*i));
		}	
		System.out.println();
	}//p
		
	
	
	void print() { // 오버로딩!

		/*
		for (int dan = 2; dan<=9 ; dan++) {
			System.out.println("*** "+dan+"단 ***");
			for(int i = 1; i<=9; i++) {
				System.out.println(dan+" * "+i +" = "  +(dan*i));
			}
		}
		System.out.println();
		
		/* print(2);로 요약할 수 있음.
		 * print(2); // 이미 print (int dan)의 인스턴스 객체를 만들었기 때문에 호출가능
		// this.print(2) :  자기 참조 객체(this.) - 생략 가능 
		 */ 
		
		/* 시작~ 종료단 만드는것도 했다면
		 * print(2,9);  도 가능해진다.
		 */
		 
		for (int dan = 2; dan<=9 ; dan++) {
			print(dan);
		}
	} // p
	
	
	
	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * @param sDan 시작단
	 * @param eDan 종료단
	 */
	void print(int sDan, int eDan) {
		
		for(int dan = sDan; dan <= eDan; dan++) {
			print(dan);
		}
	}
	
	
	int getDan() {
		// Scanner sc = new Scanner(System.in); // main의 스캐너와는 상관 없다.
		// Scanner가 메소드 안에있으면 계속 new때문에 영역차지해서 비효율적임.
		// GuGuDan의 멤버변수로 선언할 수 있다 = 밖에 선언해도 된다.
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
		
	}
	
	
	/**
	 * 메시지를 입력받아서 정수입력하는 메소드
	 * @param msg  String 메시지
	 * @return
	 */
	int getDan(String msg) { 
		System.out.println(msg);
		//Scanner sc = new Scanner(System.in); // main의 스캐너와는 상관 없다.
		int dan = sc.nextInt(); //  int dan = getDan(); 하나쓰면 여기서부터 모두 생략가능.
		sc.nextLine();
		
		return dan;
		
	}
						
					
					
		
}//c
