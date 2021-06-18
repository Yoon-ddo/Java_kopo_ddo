package StaticStudy;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.printTotalEmployee();
		
		
		Employee e = new Employee("홍길동", 3200, "사원");
		// e.team = "ddd"; team 멤버변수에 private 달아주었기 때문에 접근 불가
		e.info();
		Employee e2 = new Employee("강길동", 4000, "주임");
		e2.info();
		Employee e3 = new Employee("윤길동", 3500, "사원");
		e3.info();
		
		// static 메소드에 접근하는 방법 ( 클래스명.메소드명(); )
		//static final 붙이는 이유? - 누구도 고치지 못하게.
		// Employee.printTotalEmployee();
		
		// 멤버변수를 불러오는 메소드
		System.out.println("첫번째 사원 명 : " +  e.getName());
		System.out.println("두번째 사원 명 : " +  e2.getName());
		
		
		// 수정하는 메소드
		e.setSalary(2900);
		System.out.println("첫번째 사원 연봉삭감 : " +  e.getSalary());
		
		

	}

}
