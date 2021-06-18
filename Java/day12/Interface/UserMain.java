package Interface;

public class UserMain {

	public static void main(String[] args) {
		
		SamSungTV sam = new SamSungTV();
		sam.powerOn();
		sam.channelDown();
		sam.channelUp();
		sam.powerOff();
		
		LGTV lg = new LGTV();
		lg.turnOn();
		lg.channelDown();
		lg.channelUp();
		lg.turnOff();
	
		
		/* -----> TV를 켜고 끄는 기능은 같지만 다른 회사라서 이름이 다른 메소드를 지니고있다. 
		* [ 어느 TV회사든 같은 기능이라면 메소드 이름을 동일하게 하고 싶다. ] : 표준을 만들고 싶다.
		* 
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
