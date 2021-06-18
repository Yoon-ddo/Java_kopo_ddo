package day3;

import java.util.Scanner;

public class HwReview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		System.out.println(first + "는 " + second + "의 배수인가?  " + (second > 0 && first%second ==0 ? "참" : "거짓"));
		
	}

}
