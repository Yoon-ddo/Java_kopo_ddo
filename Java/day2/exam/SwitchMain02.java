package day2.exam;

import java.util.Scanner;

/*
 * 좋아하는 계절 입력 : spring
 * 봄은 3월~5월까지 입니다.
 */
public class SwitchMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 계절을 입력");
		String season = sc.nextLine();
		
		/*
		if (season.equals("봄")) { // (season == "봄")으로 조건을 주면 못알아듣는다.
			System.out.println("봄은 3~5월까지입니다.");
		} else if (season.equals("여름")) {
			System.out.println("여름은 6~8월까지입니다.");
		} else {
			System.out.println("Error!");
		}
		*/
		
		
		switch (season) {
		case "봄" :
		case "spring" :
		case "SPRING" :
			System.out.println("봄은 3~5월까지입니다.");
			break;
		case "여름" :
			System.out.println("여름은 6~8월까지입니다.");
			break;
		default :
			System.out.println("Error!");
		}
		
	}

}
