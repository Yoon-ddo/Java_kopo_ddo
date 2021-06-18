package Subject;

import java.util.Arrays;

public class ArrCopy02 {

	public static void main(String[] args) {
		// 두개의 배열 합쳐서 c에 삽입.
		/*
		int[] a = {10,20,30};
		int[] b = {5,7,8,9,20,23};
		int[] c = new int[a.length + b.length];
		
		// 아주 번거롭다. System.arraycopy( )를 사용하자.
		int loc = 0;
		for (int i =0; i <a.length; i++) {
			c[loc++] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			c[loc++] = b[i]
		}*/
		/*
		int[] a = {10,20,30};
		int[] b=new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length); // a의 0번째부터를 b의 0번째에 a.length만큼 복사.
		
		System.out.println("b : "+Arrays.toString(b));
		*/
		
		//
		
		/* arraycopy
		int[] a = {10,20,30};
		int[] b = {5,7,8,9,20,23};
		int[] c = new int[a.length + b.length];
		
		System.arraycopy(a, 0, c, 0, a.length); // a[0]부터 전부를 c의 [0]부터 복사
		System.arraycopy(b, 0, c, a.length, b.length); // a.length-1번째까지는 다찼으니 a.length부터 b.length길이만큼 복사
		System.out.println("c : "+Arrays.toString(c));
		*/
		
		int[] a = {10,20,30,40,50};
		
		for (int num :a) { // int num = a[0] 했지만
			num = num +100;
		}
		for (int num :a) {
			System.out.println(num); 
		} // print해도 나오지 않는 이유? 1.5버전은 사용하지 않는다.
		
		
		
		
	}//m

}
