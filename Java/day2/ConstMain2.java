package day2;

public class ConstMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		ch = 65; // 65를 할당해도 ch는 char타입이므로 문자에 맞게 출력된다.
		ch = '\u0041';
		//ch = '\uAC00';
		System.out.println("문자 : " + ch);
		System.out.println((int)ch); // 형변환 : 원래 ch는 문자형이지만 잠시 정수형으로 인식하는 것
		
		System.out.println(""+'A'+'B'); 
		
		System.out.println('A'+20);
		System.out.println(12.3+45);
		
		double num = /*(double)*/ 12;
		int num2 = (int)12.34;
		
		
		int n = 10;
		n = n+1;
		n += 1; // 복합연산자. n = n+1과 같은의미.(더하고 변수에 대입한다)
		
		n = 10;
		System.out.println(++n);
		
		n = 10;
		System.out.println(n++);
		
		n = 1;
		System.out.println(++n + ++n); // 2+3 = 5
		
		int a=1, b=-1, c=0;
		boolean bool = ++a > 0 && ++b > 0 && ++c > 0;
		// a = 2, b = 0, c = 0
		//c는 뭔지몰라서 연산할 수 없으므로 c는 0이다.
		// 풀이방법
		// (++a > 0 && ++b > 0) -> &&는 앞이 참이면 뒤도 확인, (T && F) = F
		// F && ++c -> 앞이 F이므로 뒤는 볼필요도 없음.
		
		System.out.println("bool : " + bool); // F
		System.out.println("a :" + a + ", b : " + b + ", c : " + c); 
		
		
		int a2=1, b2 = -1, c2 = 0;
		boolean bool2 = a2++ > 0 || b2++ > 0 || c2++ > 0;
		// a = 1 ,
		// a++ > 0 || b++ > 0 ->T
		System.out.println("bool2 : " + bool2); // T
		System.out.println("a2 :" + a2 + ",b2 : " + b2 + ", c2 : " + c2); 
		
		
		int a3=1, b3 = -1, c3 = 0;
		boolean bool3 = a3++ > 0 || b3++ > 0 && c3++ > 0;
		// a = 1 ,
		// b3++ > 0 && c3++ > 0 먼저 계산
		// 
		System.out.println("bool3 : " + bool3); // T
		System.out.println("a3 :" + a3 + ", b3 : " + b3 + ", c3 : " + c3); 

	}

}
