package day2;

public class IfMoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 5;
		//System.out.println(a>b ? a : (a<b ? b : 0));
		
		if(a>b) { // a>b�̸� a���
			System.out.println(a);
		} else if(a<b) { //a�� b���� �۰ų� ���� ��� �߿���
			System.out.println(b);
		} else { // a�� b�� ���ٸ� 0
				System.out.println(0);
			}
		
		
}
}