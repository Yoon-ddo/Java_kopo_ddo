package SaintSungJa;


public class MemberMain {
	
	public static void main(String[] args) {
			
	Member m = new Member(); // 초기값 - 이름 : null, 나이 : 0, 혈액형 : null (내가 원하는 값으로 초기화 하기 위해서 생성자를 만든다.)
	m.info(); // 초기값은 [이름 : 알 수 없음, 나이 : -1, 혈액형 : 알 수 없음] 이 된다.
	
	Member m2 = new Member("홍길동");
	m2.info();
	
	Member m3 = new Member("강길동",20);
	m3.info();
	
	Member m4 = new Member("박길동",33,"AB");
	m4.info();
	
	
	}
	

}
