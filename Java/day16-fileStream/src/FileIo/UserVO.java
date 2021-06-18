package FileIo;

import java.io.Serializable;

// VO = Value Object - 데이터 저장하기 위한 목적의 클래스
public class UserVO implements Serializable{
	
	private String name;
	private int age;
	private String addr;
	private String phone;
	
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVO(String name, int age, String addr, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
	
	
}
