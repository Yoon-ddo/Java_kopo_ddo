package SangSok;

public class ExtendsMain01 {

	public static void main(String[] args) {
		// 사원 번호가 1, 연봉을 4000을 받은 마케팅팀 홍길동 사원 객체 생성
		Employee e = new Employee(1, "홍길동" , 4_000, "사원" , "마케팅팀");
		Employee e2 = new Employee(2, "박길동" , 4_200, "사원" , "마케팅팀");
		Employee e3 = new Employee(3, "강길동" , 4_800, "대리" , "영업팀");
		Employee e4 = new Employee(4, "한길동" , 5_800, "차장" , "마케팅팀");
		Employee e5= new Employee(4, "정길동" , 6_800, "과장" , "개발팀");
		// 4,000처럼 구분하고 싶을 때 _로 구분할 수 있다. (4_000)
		
		/*
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		*/
		
		Employee[] empList = {e,e2,e4};
		//Manager01 m = new Manager01(100,"나부장", 9_000,"부장","마케팅팀",empList);
		//Manager02 m = new Manager02(100,"나부장", 9_000,"부장","마케팅팀",empList);
		Manager03 m = new Manager03(100,"나부장", 9_000,"부장","마케팅팀",empList);
		m.info();

	}

}
