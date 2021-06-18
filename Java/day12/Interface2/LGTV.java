package Interface2;

public class LGTV implements TV {
	
	public LGTV() {
		System.out.println(" 헬지티비 구매완료... ");
	}

	@Override
	public void powerOn() {
		System.out.println(" 전원을 켭니다. ");
		
	}

	@Override
	public void powerOff() {
		System.out.println(" 전원을 끕니다. ");
		
	}

	@Override
	public void channelUp() {
		System.out.println(" 채널을 올립니다. ");
		
	}

	@Override
	public void channelDown() {
		System.out.println(" 채널을 내립니다. ");
		
	}

	@Override
	public void soundUp() {
		System.out.println(" 음량을 올립니다. ");
		
	}

	@Override
	public void soundDown() {
		System.out.println(" 음량을 내립니다. ");
		
	}

	@Override
	public void mute() {
		System.out.println(" 음소거. ");
		
	}
	

}
