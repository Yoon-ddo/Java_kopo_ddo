package ExceptionStudy;

public class WhyUseFinally {

	public static void main(String[] args) {

		System.out.println("Main start...");
		
		for (int i = -2 ; i <3; i++) {
			System.out.println(i+"번째 반복문 수행중...");
			try {
			System.out.println(10/i);
			} catch(Exception e) {
				System.out.println("예외발생...");
				break;
			}finally { // 에러가 나든 안나든 수행.	
				// finally 안쓰고 그냥 밖에 sysout 쓰면 break로 인해 반복문에서 탈출되어 밖에 쓴 문장이 수행되지 않는다.		
				System.out.println("반복문 수행쥬웅~");
			}
		}
		System.out.println("main end...");

	}

}
