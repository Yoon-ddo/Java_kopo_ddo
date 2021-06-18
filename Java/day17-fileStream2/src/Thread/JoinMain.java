package Thread;


public class JoinMain {

	public static void main(String[] args) {
		ExtendThread et = new ExtendThread();
		ImplementThread it = new ImplementThread();
		Thread t = new Thread(it);
		
		System.out.println("감독을 시작합니다.");
		et.start();
		t.start();
		
		try {
			et.join(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("감독을 종료합니다.");

	}

}
