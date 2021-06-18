package Method;

public class MethodMain01 {

	public static void main(String[] args) {
		
		MyMethod m = new MyMethod(); // 인스턴스 객체 생성
		m.call();
		
		m.call(0);
		m.call(12.34);
		m.call("Hello"); // 오버로딩!
		m.call('A'); // char 메소드 정의 안해도 에러 안나는 이유?
					// char->int->long->float->double 순으로 묵시적 형변환
					//  char과 가장 가까운 int 출력(int없으면 double)
		
		
		m.call("hello", true); // 순서는 바뀌지 말아야 할것!
		
	
	
	
	
	}

}






















