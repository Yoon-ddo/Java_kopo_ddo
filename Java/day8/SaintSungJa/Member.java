package SaintSungJa;

public class Member {
	
	String name;
	int age;
	String bloodType;
	
	//생성자는 멤버변수와 메소드 사이에 들어간다.

	Member(){
		/* 타입 안써줘도 돼!
		name = "알 수 없음";
		age = -1;
		bloodType = "알 수 없음";
		// 초기값 : [이름 : 알 수 없음, 나이 : -1, 혈액형 : 알 수 없음]
		*/
		
		this("알수없음",-1);

	}
	Member(String name){ 
		/* (String name), name=name;으로 지정할 경우 지역변수가 우선이므로 생성자/메소드 안에서 생성한 것을 인식. 
		name = name; // 멤버변수 name = 생성자의 name으로 하려고했는데 모두 생성자에서 입력받은 것으로 인식함.(= 멤버변수와 다르게 설정할것)
		***>그런데! 지역변수와 멤버변수를 구분하지 못하지만 멤버변수와 맞춰주고 싶은 경우. ****this. ****
		this.name = name; //  멤버변수 = 생성자 지역변수 로 인식하게된다.
		
		age = -1;
		bloodType = "알 수 없음";
		// 초기값 : [이름 : 홍길동, 나이 : -1, 혈액형 : 알 수 없음]
		*/
		this(name, -1);
	}
	Member(String name, int age){
		/*
		this.name = name;
		this.age = age;
		bloodType = "알 수 없음";
		
		* Member(name, age, "알수없음"); //4번째 Member생성자를 불러 오면 코드가 간단해진다. 
		* 그런데 이렇게 쓰면 에러남.
		* 해결방법은 this
		*/
		
		this(name, age, "알수없음"); 
		// 생성자소환을 위한 this 생성자는 반드시 맨 윗줄에 적어야한다. 위에 sysout 불가.
		// + 한번만 사용 가능하다.
	}
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	
	
	
	
	
	void info() {
		System.out.println("이름 : "+ name + ", 나이 : "+ age + ", 혈액형 : "+ bloodType);
	}

}
