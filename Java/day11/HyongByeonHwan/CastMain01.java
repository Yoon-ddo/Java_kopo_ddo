package HyongByeonHwan;

public class CastMain01 {
	
	/*
	public static void print(Child01 c) {
		c.info();
	}
	
	public static void print(Child02 c) {
		c.info();
	}
	*/
	
	//얘만 있어도 에러안남 - 묵시적 형변환
	// info()메소드에만 접근 가능함.
	public static void print(Parent p) { //main메소드가 static이므로
		p.info();
	}

	public static void main(String[] args) {
		
		Child01 c01 = new Child01();
		print(c01);
		//c01.info();
		
		Child02 c02 = new Child02();
		print(c02);
		//c02.info();
		
		Parent p = new Parent();
		print(p);
		//p.info();
		// -----c01이든 c02든 p가 받도록. 묵시적 형변환이 일어나고있다.
		
		
		
		
		/*
		//묵시적 형변환 child01의 인스턴스객체 값을 Parent p가 갖도록
		Parent p = new Child01();
		p.info(); // 자식이 가진 info()를 불러올 수 있음
		System.out.println(p.name + ", "+p.age); // 부모가 찍힌다.
		 */
		
		/*
		Child01 c01 = new Child01();
		System.out.println(c01.name + ", "+c01.age);
		c01.info(); // 자기자신
		
		Parent p = new Parent();
		System.out.println(p.name + ", "+p.age);
		p.info(); // 자기자신
		*/
		
		

	}

}
