package FinalStudy;

import java.util.Random;

/* final */ class Super{ // final을 클래스 앞에 붙이면 Sub클래스에서 접근 못함.
	
	private /* final */ int max = 100; // final 붙이면 절대 못바꿈.
	private final int MAX = 100; // final의 변수명은 항상 대문자로 쓴다.
	public void info() {
		System.out.println(" Super클래스에서 정의된 메소드 ... ");
		max = 50;
	}
	
	public final void info2() { // 오버라이드 금지
		System.out.println(" Super클래스에서 정의된 메소드 ... ");
		max = 50;
	}
}

class Sub extends Super{
	
	@Override
	public void info() {
		System.out.println(" Sub클래스에서 정의된 메소드 ... ");
	}
	
	/*
	@Override
	public void info2() {
		System.out.println(" Sub클래스에서 정의된 메소드 ... ");
	}*/
	
}



class MyRandom extends Random{ 
	
	// 1-100까지 난수를 생성하는 나만의 랜덤클래스 만들고 싶어.
	
	/**
	 * bound가 10일때 1~10 사이의 난수 추출
	 * @Param bound 난수 범위
	 * @return 1~bound 사이의 난수
	 */
	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		return super.nextInt(bound)+1; // main에서 실행시 r.nextInt(100);만 써줘도 0출력안됨
	}	
}

// String 클래스도 다시 불러와서 MyString으로 만들고싶은데 안돼!
//   ->  이유는 String 클래스는 final이기 때문.

public class FinalMain {
	public static void main(String[] args) {
		Random r= new MyRandom();
		int random = r.nextInt(100);
		System.out.println("추출된 정수 : "+ random);

	}

}
