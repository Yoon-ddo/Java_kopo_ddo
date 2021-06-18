package day2;

public class IfMoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 5;
		//System.out.println(a>b ? a : (a<b ? b : 0));
		
		if(a>b) { // a>b이면 a출력
			System.out.println(a);
		} else if(a<b) { //a가 b보다 작거나 같은 경우 중에서
			System.out.println(b);
		} else { // a가 b와 같다면 0
				System.out.println(0);
			}
		
		
}
}