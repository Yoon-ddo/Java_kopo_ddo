package day2.exam;

import java.util.Scanner;

/*
 * 집에서 출발한 시간 8시 이전 : 걸어서
 * 				8시 15분 이전 : 버스
 * 				8시 15분 이후 : 택시
 * 
 * 집에서 출발한 시간 입력 (8시 5분은 805입력) 
 */
public class ExamMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("지갑에 얼마있니? : ");
		int money = sc.nextInt();
		System.out.println(money+"원");
		
		if (money < 3000) {
			System.out.println("그냥 학식이나 먹어라");
		} else if (money < 5000) {
			System.out.println("편의점ㄱ");
		} else if (money <9000){
			System.out.println("차돌짬뽕쌉가능");
		} else {
			System.out.println("초밥먹자초밥");
		}
	
		
	}

}
