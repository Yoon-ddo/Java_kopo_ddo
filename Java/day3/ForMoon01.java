package day3;

// Hello World! 5번반복
public class ForMoon01 {

	public static void main(String[] args) {
				
		System.out.println("--------------------");
		int cnt = 1; // cnt는 가장 가까운{가 main메소드
		while(cnt <= 3) {
			System.out.println("Hello World!");
			++cnt;
		}
		System.out.println("--------------------");

		for(int c = 1; c<=3; ++c) {
			System.out.println("Hello World!");
		}
		System.out.println("--------------------");
	}

}
