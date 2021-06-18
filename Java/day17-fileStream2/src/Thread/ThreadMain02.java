package Thread;
/*
 * Thread 구성 2가지
 * 1. Thread 클래스 상속
 * 2. Runnable 인터페이스 상속 구현
 */


class ExtendThread extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(i+1 + "번째 인형 눈 붙이기...");
		}
	}
}

class ImplementThread implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <100 ; i++) {
			System.out.println(i+1 + "번째 인형 **코** 만들기...");
		}
	}
}

public class ThreadMain02 {
	
	public static void main(String[] args) {
		ExtendThread et = new ExtendThread();
		ImplementThread it = new ImplementThread();
		Thread t = new Thread(it);
		
		et.start();
		t.start();
		
		for(int i = 0; i<100; i++) {
			System.out.println("[ "+ i+1 + " ] 감독중...");
		}
	}
	
	
	

}
