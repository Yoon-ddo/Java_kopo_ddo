package MakeClass;



// 실행 클래스
public class CarMain { // 프로그램을 실행하기 위한 Class, 

	public static void main(String[] args) {
		
		// Heap영역에 Car이 생성됨.
		// new Car(); //는 값이 아무것도 없기 때문에 참조변수 c로 이것을 받아준다.
		Car c = new Car(); // c는 참조변수
		
		// JVM이 인식해야 얼만큼 공간이 필요한지 알 수 있음.
		//System.out.println(C.name);
		c.name = "소나타";
		c.price = 3200;
		c.company = "현대";
		
		System.out.println("모델명 : " + c.name + ", 가격 : "+c.price + ", 만원, 제조사 : " + c.company);
		
		
		Car c2 = new Car(); // c2는 참조변수
		c2.name = "k5";
		c2.price = 3000;
		c2.company =  "기아";
		
		System.out.println("모델명 : " + c2.name + ", 가격 : "+c2.price + ", 만원, 제조사 : " + c2.company);

	}

}
