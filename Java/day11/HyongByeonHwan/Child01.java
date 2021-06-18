package HyongByeonHwan;

public class Child01 extends Parent {
	
	//private를 쓰는 이유? 자식 말고 부모꺼에 접근하게함.
	String name = "자식01";
	int age = 5;
	
	public void study() {
		System.out.println("나는 공부를 합니다.");
	}
	
	public void sleep() {
		System.out.println("나는 자요.");
	}
	
	
	@Override
	public void info() {
		System.out.println("child01에서 재정의된 부모의 메소드");
	}

}
