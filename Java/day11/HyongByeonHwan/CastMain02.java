package HyongByeonHwan;

public class CastMain02 {
	
	public static void print(Parent p) { 
		p.info();
		if (p instanceof Child01) {
			Child01 c = (Child01)p; // instanceof가 true : Child01이면 형변환
			c.sleep();
			c.study();
		} else if (p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		} //  자식부터 if문에 걸어주어야 한다. 
		
		
		/*
		System.out.println("p instanceof Child01 : "+(p instanceof Child01));
		System.out.println("p instanceof Child02 : "+(p instanceof Child02));
		System.out.println("p instanceof Parent : "+(p instanceof Parent));
		*/
	
	}


	public static void main(String[] args) {
		
		/* 에러~~ Child02 c = new Parent();
		 * Child02 c = (Child02)new Parent();
		 * Child02로 형변환 해줬지만 에러남. 
		 * 메모리가 안잡혀있기 때문 */
		
		Parent p = new Child02(); // 묵시적 형변환
		p.info(); // p는 Child01형을 가르킨다.
		
		Child02 c = (Child02)p;
		/* 명시적 형변환
		int a = 65;
		char c1 = (char)a;
		System.out.println(c1);
		*/
		c.info(); // 오버라이드된 메소드
		c.play();
		c.sing();
		/*
		 *컴파일에러 : 메모리공간에 접근시 에러.
		 *실행시에러
		 */
		System.out.println();
		
		
		
		// 명시적 형변환 : info()이외에 study나 sing 같은 그외 메소드를 호출하고 싶을때사용
		// 근데 p가 뭔지 어케알까? instanceof 사용하자	
		// 같은 클래스 이거나 상속일때만 사용 가능 
		Child01 c01 = new Child01();
		print(c01);
		System.out.println();
		
		Child02 c02 = new Child02();
		print(c02);
		System.out.println();
		
		Parent pa = new Parent();
		print(pa);
		System.out.println();

	}

}
