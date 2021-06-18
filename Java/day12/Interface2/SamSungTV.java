package Interface2;

public class SamSungTV implements TV {
	// 인터페이스를 상속. = implements
	
	
	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteFlag; // boolean형의 초기값은 false
	private int currentVolumeSize;
	
	
	
	public SamSungTV() {
		System.out.println(" 샘숭티비 구매완료... ");
		power = false;
		channelNo = 10;
		volumeSize = 3;
		muteFlag = false;
		info();
	}

	
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("< POWER ON >");
		
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("< POWER OFF >");
		
	}

	@Override
	public void channelUp() {
		System.out.println("< CHANNEL UP >");
		channelNo = ++channelNo % 101; // cNo가 100이면 100+1해주고 %101 하면 0이됨
		// channelNo가 100이면 0이되게 해준단 뜻
		info();
		
	}

	@Override
	public void channelDown() {
		System.out.println("< CHANNEL DOWN >");
		channelNo--;
		if(channelNo == 0) {
			channelNo = 100;
		}
		info();
		
	}

	@Override
	public void soundUp() {
		System.out.println("< VOLUME UP >");
		if(!muteFlag && volumeSize < TV.MAX_VOLUME_SIZE) { // 음소거가 아닌것중 볼륨크기가 max볼륨보다 작은경우
			volumeSize++;
			currentVolumeSize = volumeSize;
			muteFlag = false;
		} else {
			System.out.println("음소거중입니다. 음소거를 해제하세요.");
		}
		info();
		
	}

	@Override
	public void soundDown() {
		System.out.println("< VOLUME DOWN >");
		if(!muteFlag && volumeSize > TV.MIN_VOLUME_SIZE) {
			volumeSize--;
			currentVolumeSize = volumeSize;
			muteFlag = false;
		} else {
			System.out.println("음소거 중입니다. 음소거를 해제하세요.");
			
		}
		info();
		
	}

	@Override
	public void mute() {
		System.out.println("< MUTE >");
		if(muteFlag) {
			System.out.println("음소거 해제");
			muteFlag = false;		
		}else {
			System.out.println("음소거 중");
			muteFlag = true;
		}

		//muteFlag = !muteFlag; // if문을 한줄로...
		info();
	}
	
	public void info() { // private선언하면 메소드를 숨길 수 있어용ㅎㅎ
		System.out.println("채널번호 : "+ channelNo + ", 음량크기 : " + volumeSize);
	}
	
	

	
	
	
	
	
	
	
}
