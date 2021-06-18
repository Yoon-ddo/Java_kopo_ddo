package SangSok;
// 사원 클래스
public class Employee {
	
	int no;
	String name;
	int salary;
	String grade;
	String team;
	
	Employee(){
		//얘가 없으면 Manager02에서 상속시 에러가난다!
	}
	Employee(int no, String name, int salary, String grade, String team){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.team = team;
	}

	
	void info() {
		System.out.println("사원번호 : "+no
				+ ", 사원명 : "+name  + ", 연봉 : "+salary
				+ "만원, 직급 : "+grade + ", 소속부서 : "+team);
	}
	
	
}
