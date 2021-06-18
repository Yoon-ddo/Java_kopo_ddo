package HyongByeonHwan;

public class Child02 extends Parent {

	private String name = "자식02";
	
	public void sing() {
		System.out.println("나는 노래하네~");
	}
	public void play() {
		System.out.println("나는 놀아~");
	}
	
	@Override
	public void info() {
		System.out.println("Child02에서 재정의된 부모의 메소드");
	}
	
	
	
}
