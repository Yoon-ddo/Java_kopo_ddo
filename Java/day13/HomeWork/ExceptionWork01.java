package HomeWork;

import java.util.Scanner;
// 풀이1) try / catch


public class ExceptionWork01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int yourNum = sc.nextInt();
		sc.nextLine();
		
		
		try {
			
			if(yourNum>45 || yourNum<1) {
				System.out.println("LottoNumberException : 1 - 45사이만 가능합니다. "
						+ yourNum+"은 올바르지 않습니다.");
			} else {
				System.out.println(yourNum+"을(를) 포함해서 로또번호들을 추출하겠습니다.");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}//main

}
