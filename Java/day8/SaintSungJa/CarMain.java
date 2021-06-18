package SaintSungJa;

public class CarMain {

	public static void main(String[] args) {
		
		
		// 생성자 호출
		// new로 접근해야함. *메소드는 객체명.메소드()
		Car c = new Car();
		Car c2 = new Car("소나타");
		Car c3 = new Car(3,"모닝");
		
		// 일반 메소드 호출
		c.constructor();

	}

}
