package SangSok;

public class Manager01 {
	
	int no;
	String name;
	int salary;
	String grade;
	String team;
	
	Employee[] empList; // 관리사원 목록 저장
	
	Manager01(int no, String name,int salary, String grade, String team, Employee[] empList){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.team = team;
		this.empList = empList;
		
	}

	public void info() {
		System.out.println("사원번호 : "+no
				+ ", 사원명 : "+name  + ", 연봉 : "+salary
				+ "만원, 직급 : "+grade + ", 소속부서 : "+team);
		
		System.out.println("========================================================");
		System.out.println("\t관리사원 목록");
		System.out.println("========================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("========================================================");
		
	}

}
