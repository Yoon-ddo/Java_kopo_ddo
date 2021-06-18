package SangSok;

public class Manager02 extends Employee {
	Employee[] empList; // 관리사원 목록 저장
	
	
	
	Manager02(int no, String name, int salary, String grade, String team, Employee[] empList){
		//에러가나는 이유? Employee에 매개변수 없는 기본생성자가 없기 때문.
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.team = team;
		this.empList = empList;
		// employee에서 private 붙여주면 에러난다.
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
