package Thread;


class CallCenter2 extends Thread{
	private int price ;
	private int type ;
	
	
	public CallCenter2(int type) {
		this.type = type;
		this.price = 0;
	}
	
	public int money() {
		int money = (int) ((Math.random() * 10 + 1));
		money *= 1000;
		return money;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<10; ++i) {
			int money = money();
			System.out.println(type + "번 콜센터 : " + money + "원 받았습니다.");
			price += money;
		}
		System.out.println(type + "번 콜센터 총 성금액 : " + price);
	}
	
	public int totalMoney() {
		return this.price;
	}
}

public class CallCenterMain2 {
	public static void main(String[] args) {
		CallCenter2 cc1 = new CallCenter2(1);
		CallCenter2 cc2 = new CallCenter2(2);
		CallCenter2 cc3 = new CallCenter2(3);
		CallCenter2 cc4 = new CallCenter2(4);
		
		cc1.start();
		cc2.start();
		cc3.start();
		cc4.start();
		
		try {
			cc1.join();
			cc2.join();
			cc3.join();
			cc4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("국민들이 주신 총 금액 : " + (cc1.totalMoney() + cc2.totalMoney() + cc3.totalMoney() + cc4.totalMoney()));
	}
}