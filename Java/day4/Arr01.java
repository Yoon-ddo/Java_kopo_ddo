package Subject;

public class Arr01 {

	public static void main(String[] args) {
		
		int [] arr;
		arr = new int[5];	// arr[0] ~ arr[4]
		System.out.println("arr : "+arr+ ", 원소개수 : " + arr.length); // arr : [I@3830f1c0 -> 주소값이 나온다.
		
		System.out.println("첫번째 정수 : " + arr[0]); // 첫번째 정수 : 0 --> 0으로 초기화되었기 때문에 0이 나옴.
		System.out.println("두번째 정수 : " + arr[1]);
		System.out.println("세번째 정수 : " + arr[2]);
		System.out.println("네번째 정수 : " + arr[3]);
		System.out.println("다섯번째 정수 : " + arr[4]);
		
		//for문으로 출력 가능.
		System.out.println("--For문으로 출력----------------");
		for (int i = 0; i<5; i++) {
			System.out.println(i+1 + "번째 정수 : " + arr[i]);
		}
		
		// arr을 다른 배열로 선언해주면 다른 주소를 가지게 된다.
		arr = new int[3];
		System.out.println("arr : "+arr+ ", 원소개수 : " + arr.length); //[I@39ed3c8d, 개수 : 3
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 + "번째 정수 : " + arr[i]);
		} --> Error. Exception에러는 코드에 에러가 있다는 뜻임.
		*/
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println(i+1 + "번째 정수 : " + arr[i]);
		}
		
		
		
		
		
		

	}

}


