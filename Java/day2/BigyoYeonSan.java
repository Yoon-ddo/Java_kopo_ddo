package day2;

import java.util.Scanner;

public class BigyoYeonSan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // Scanner사용하고 싶으면 import 해야함.
		// import java.util.Scanner; 입력
		// ctrl + shift + o : 자동 import가능
		
		// 정수를 입력하세요 : 문장을 출력
		System.out.print("정수를 입력하세요 : ");
		
		// 키보드로 정수를 입력
		int num = sc.nextInt(); //키보드로 정수를 입력받는 명령어
		
		// 결과 출력
		boolean result = (num > 0  && num%2 == 0); 
		//num이 0보다 크니? 그럼 num%2==0수행해. / 0보다 작으면 수행할 필요도없어.
		System.out.println(num + "의 짝수 유무 : " + result);
		
		
	}

}
