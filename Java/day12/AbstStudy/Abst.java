package AbstStudy;

public abstract class Abst {
	

	public abstract void Hi(); // 오버라이드
	
	
	public static void hiW() {
		Abst abst = new Rectangle(); // 묵시적형변환
		abst.Hi(); // Rectangle클래스에서 오버라이드 된 Hi함수 소환.
		System.out.println("Hello World!");

		
	
		
	}

}
