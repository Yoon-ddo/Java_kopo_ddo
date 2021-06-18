package Method;

import java.util.Scanner;

public class GuGuDanMain {

	public static void main(String[] args) {
		
		GuGuDan gu = new GuGuDan();
		
		
		//Scanner sc = new Scanner(System.in);
		
		
		/*
		System.out.println("2-9 사이의 단 입력 : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		
		//gu.print(dan);
		//gu.print();*/
		
		
		/*
		GuGuDan gu = new GuGuDan();
		System.out.println("시작단을 입력 : ");
		int startDan = sc.nextInt();
		sc.nextLine();
		
		System.out.println("종료단을 입력 : ");
		int endDan = sc.nextInt();
		sc.nextLine();
		
		gu.print(startDan, endDan);
		*/
		
		
		//하나의 정수만 입력받는 메소드 만들기 
		//System.out.println("2-9 사이의 단 입력 : ");
		//int dan = gu.getDan(); 
		// getDan() 안에 스캐너 있어서 맨위의 스캐너는 없어도 된다.
		
		
		
		/*System.out.println("시작단을 입력 : ");
		int startdan = gu.getDan();
		System.out.println("종료단을 입력 : ");
		int enddan = gu.getDan();
		gu.print(startdan, enddan);*/
		
		
		
		int startdan = gu.getDan("시작단을 입력 : ");
		int enddan = gu.getDan("종료단을 입력 : ");
		gu.print(startdan, enddan);
		
	}

}

