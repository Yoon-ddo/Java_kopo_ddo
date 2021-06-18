package AbstractGongBu.abs02;

public class LGPrinter extends Printer {
	//The type LGPrinter must implement the inherited abstract method Printer.print()
	// 추상클래스를 상속받으면 printer에 있는 추상메소드를 재정의해야함.
	
	@Override
	public void print() {
		System.out.println("LG프린터에서 출력중...");
		
	}
	
	
	/**
	 * LG프린터에서 출력중...
	 
	public void lgPrint() {
		System.out.println("LG프린터에서 출력중...");
		
	}
	*/

}
