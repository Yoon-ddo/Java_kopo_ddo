package Interface2;

public interface TV {
	// 인터페이스는 반드시 public형태를 갖는다.
	// 인터페이스는 표준화의 역할을 한다.
	
	
	// 인스턴스 객체는 공간을 만들수 없으므로 (public static final)가 생략된 형태다.
	/* public static final */ int MAX_VOLUME_SIZE = 50;
	/* public static final */ int MIN_VOLUME_SIZE = 0;
	
	/* public abstract */ void powerOn();
	/* public abstract */ void powerOff();
	/* public abstract */ void channelUp();
	/* public abstract */ void channelDown();
	/* public abstract */ void soundUp();
	/* public abstract */ void soundDown();
	/* public abstract */ void mute();
	
	// 1.8버전에서 인터페이스에 default키워드를 붙이면 일반메소드 생성가능
	 default void copyright() {
		System.out.println("모든 기술은 TV협회에 귀속됩니다.");
	 }

	
	
	

}
