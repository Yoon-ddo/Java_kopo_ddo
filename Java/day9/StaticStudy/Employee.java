package StaticStudy;
// 사원이 들어올때마다 몇명이 입사했는지 알고싶다.
public class Employee {
	
	String name; // 이름
	int salary; // 연봉
	String grade; // 직급
	private String team; // team 멤버변수에 private 달아주었기 때문에 접근 불가
	
	static int totalEmployee; // 사원수 (인스턴스 객체 만들어질때마다 +1)
	
	
	//생성자 만들 때는 항상 default된 생성자를 만들어준다.
	Employee(){
	}
	
	Employee(String name, int salary, String grade){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.team = "마케팅팀";
		
		++Employee.totalEmployee; 
		// 생성자를 호출할 때 마다 사원수가 증가하게 할 수 있다.
		//그런데 이렇게 써봤자 인스턴스객체가 하나씩만 만들어지기 때문에 사원수는 항상 : 1
		// totalEmployee변수는 공유되어야 총 사원수를 알수있으므로 static을 붙인다.
	}
	
	
	
	void info() {
		System.out.println("name : " + name 
				+",  salary : " + salary
				+ ",  grade : " + grade
				+ ", team : " + team);
		Employee.printTotalEmployee(); 
		// 일반변수가 만들어졌으면 이미 static은 만들어졌으니 사용가능
	}
	
	static void printTotalEmployee() {
		// static 변수와 그것을 가진 메소드를 객체생성하지 않아도 호출할 수 있게 static 선언
		// static 함수 안에서는 static변수, 함수만 호출가능. this불가!!!
		System.out.println("총 사원수 : "+ Employee.totalEmployee + "명");
	}
	
	
	// 보통 get--이면 멤버변수를 받는 메소드이다.
	public String getName() {
		return this.name;
	}
	public int getSalary() {
		return this.salary;
	}
	public String getgrade() {
		return this.grade;
	}
	
	
	// 외부에서 값을 고치는 메소드
	public void setSalary(int salary){
		this.salary = salary;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	
	
	
	
	

}
