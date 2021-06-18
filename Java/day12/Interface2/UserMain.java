package Interface2;

public class UserMain {

	public static void main(String[] args) {
		
		TV stv = new SamSungTV();
		stv.powerOn();
		
		stv.mute();
		stv.soundUp();
		stv.soundUp();
		stv.mute();
		stv.soundUp();
		stv.mute();
		stv.soundDown();
		stv.mute();
		stv.soundDown();
		stv.powerOff();
		
		stv.copyright();
		
		

	}
	

}
