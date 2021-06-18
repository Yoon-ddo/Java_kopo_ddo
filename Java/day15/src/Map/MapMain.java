package Map;

import java.util.HashMap;
import java.util.Map;

class Member{
	private String name;
	private String phone;
	public Member() {
		
	}
	//source- generate~~field 하면 자동생성가능.
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	/*
	public boolean equals2(Object obj) {
		
		boolean result = true;
		
		Member mem = (Member)obj; //멤버형으로 명시적 형변환
		if (name.equals(mem.name)&& phone.equals(mem.phone)){
			result = true;
		}
		
		return result;
	}*/
	//같은 객체인지 비교하는 방법 equals가 같고 hashcode가 같다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	
	
}
class Car{
	private String name;
	private String id;
	public Car() {
		
	}
	
	public Car(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}


public class MapMain {

	public static void main(String[] args) {
		
		Map<Member, Car> carList = new HashMap<Member, Car>();
		carList.put(new Member("홍길동","010-1111-2222"), new Car("소나타","12소1212"));
		carList.put(new Member("윤길동","010-3333-4444"), new Car("모닝","13소1313"));
		carList.put(new Member("박길동","010-5555-6666"), new Car("다마스","14소1414"));
		carList.put(new Member("이길동","010-7777-8888"), new Car("스쿠터","15소1515"));
		carList.put(new Member("최길동","010-9999-0000"), new Car("카니발","16소1616"));
		carList.put(new Member("홍길동","010-0000-1111"), new Car("벤츠","17소1717"));
		
		System.out.println("등록 개수 : "+carList.size());
		carList.put(new Member("홍길동","010-1111-2222"), new Car("제네시스","34소3434"));
		// 키값이 같으면 다음들어올 값이 업데이트 된댔는데 왜 안돼 ㅡㅡ? --> new했기 때문에 새로운 주소값이 생성되어 이전과 주소값이 달라짐.
		// equals가 같으면서 해시코드도 같아야함. source-generate hashcode 자동생성가능.
		System.out.println("등록 개수 : "+carList.size());

		/*
		Member m = new Member("홍길동","010-1111-2222");
		Member m2 = new Member("홍길동","010-1111-2222");
		if(m.equals(m2)) {
			System.out.println("동일인물");
		} else {
			System.out.println("다른사람");
		}*/
		
		
		

	}

}
