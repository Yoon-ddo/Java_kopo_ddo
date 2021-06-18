package SangSok;

public class Manager03 extends Employee {
	Employee[] empList; // 관리사원 목록 저장
	
	
	
	Manager03(int no, String name, int salary, String grade, String team, Employee[] empList){
		/* 
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.team = team;
		*/
		super(no,name,salary,grade,team);
		/* 부모의 매개변수.super(~~)
		 만약 Employee 멤버변수에 private를 붙였다면 M2는 에러가나고 M3은 에러나지 않는다.
		 변화에 민감하지 않게 만들기 위해 사용한다.
		 멤버변수에 직접 접근하지 않는다.
		*/
		this.empList = empList;
	}

	public void info() {
		// Manager01에 이미 있는 코드인데 그냥 Manager01의 메소드를 불러오자.
		/*
		System.out.println("사원번호 : "+no
				+ ", 사원명 : "+name  + ", 연봉 : "+salary
				+ "만원, 직급 : "+grade + ", 소속부서 : "+team);
		*/
		super.info();
		System.out.println("====================================================================");
		System.out.println("\t관리사원 목록");
		System.out.println("====================================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("====================================================================");
		
	
	}
	

}
