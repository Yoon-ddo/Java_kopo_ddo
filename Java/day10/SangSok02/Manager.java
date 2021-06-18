package SangSok02;

public class Manager extends Employee {
	Employee[] empList;
	private Stirng name2;

	public Manager(int no, Stirng name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		name2 = name;
		this.empList = empList;
	}
	

}
