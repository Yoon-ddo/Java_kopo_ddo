package AbstractGongBu.abs02;

// 추상클래스
public abstract class HPPrinter extends Printer {
	/*
	@Override
	public void print() {
		System.out.println("HP프린터에서 출력중...");
	}
	*/
}

class HPLaserPrinter extends HPPrinter {
	
	@Override
	public void print() {
		System.out.println("HP 레이저 프린터에서 출력중...");
	}
}

class HPInkJetPrinter extends HPPrinter {
	@Override
	public void print() {
		System.out.println("HP 잉크젯 프린터에서 출력중...");
	}
}
