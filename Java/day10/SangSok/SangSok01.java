package SangSok;

class One{
	One(){
		System.out.println("One 생성자 호출...");
	}
}

class Two extends One{ // Two가 One을 상속받았다.
	Two(){
		//super(); 가 숨어있다. - One를 의미
		System.out.println("Two 생성자 호출...");
	}
}

class Three extends Two{ // Two가 One을 상속받았다.
	Three(){
		//super(); 가 숨어있다. - Two를 의미
		System.out.println("Three 생성자 호출...");
	}
}







public class SangSok01 {
	
	public static void main(String[] args) {
		new Three();
	
	} // M
}
