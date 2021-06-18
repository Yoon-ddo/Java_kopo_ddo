package FileIo;

import java.io.Serializable;

/*
 * alt + shift + s 누른 후 선택	(c) : 기본 생성자.
 * 								(o) : 매개변수를 가지는 생성자.
 * 								(r) : getter/setter 메소드
 * 								(v) : override
 * 								(s) : toString() 메소드 오버라이드
 */
/*
 * UserInfo user = new UserInfo();
 * System.out.println(user);
 * System.out.println(toString());
*/
public class UserInfo implements Serializable{
	
	private String name;
	private transient int age;
	private String addr;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
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
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
	

}
