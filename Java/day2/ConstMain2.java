package day2;

public class ConstMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		ch = 65; // 65�� �Ҵ��ص� ch�� charŸ���̹Ƿ� ���ڿ� �°� ��µȴ�.
		ch = '\u0041';
		//ch = '\uAC00';
		System.out.println("���� : " + ch);
		System.out.println((int)ch); // ����ȯ : ���� ch�� ������������ ��� ���������� �ν��ϴ� ��
		
		System.out.println(""+'A'+'B'); 
		
		System.out.println('A'+20);
		System.out.println(12.3+45);
		
		double num = /*(double)*/ 12;
		int num2 = (int)12.34;
		
		
		int n = 10;
		n = n+1;
		n += 1; // ���տ�����. n = n+1�� �����ǹ�.(���ϰ� ������ �����Ѵ�)
		
		n = 10;
		System.out.println(++n);
		
		n = 10;
		System.out.println(n++);
		
		n = 1;
		System.out.println(++n + ++n); // 2+3 = 5
		
		int a=1, b=-1, c=0;
		boolean bool = ++a > 0 && ++b > 0 && ++c > 0;
		// a = 2, b = 0, c = 0
		//c�� �������� ������ �� �����Ƿ� c�� 0�̴�.
		// Ǯ�̹��
		// (++a > 0 && ++b > 0) -> &&�� ���� ���̸� �ڵ� Ȯ��, (T && F) = F
		// F && ++c -> ���� F�̹Ƿ� �ڴ� ���ʿ䵵 ����.
		
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
		// b3++ > 0 && c3++ > 0 ���� ���
		// 
		System.out.println("bool3 : " + bool3); // T
		System.out.println("a3 :" + a3 + ", b3 : " + b3 + ", c3 : " + c3); 

	}

}
