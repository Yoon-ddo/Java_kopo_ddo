package Subject;

import java.util.Arrays;

public class Arr02 {

	public static void main(String[] args) {
		/* 초기화
		 * 1,2,3,4,5를 가지는 배열 arr을 생성 후, 출력
		 */
		
		
		// 배열생성
		int [] arr = new int[5];
		
		// 정수입력
		for (int i = 0; i<arr.length ; i++) {
			arr[i] = i+1;
		}
		
		// 초기화
		//int [] arr = new int[] {1,2,3,4,5};
		/* int [] arr = new int[4];
		* int [] arr = {1,2,3,4,5}
		*/
		
		// 배열의 정수 출력 <방법1>
		System.out.println("방법1");
		for (int i= 0; i<arr.length ; i++) {
			//System.out.println(i+1 + "번째 정수 : "+ arr[i]);
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
		// 배열의 정수 출력 <방법2>
		System.out.println("방법2");
		for (int num : arr) { // arr에 있는 모든 원소에 접근할거야.(모든 원소를 num에 할당, 배열의 크기만큼. num에 덮어씀)
			System.out.print(num + "   ");
		}
		System.out.println();
		// 배열의 정수 출력 <방법3> - Arrays.toString() 메소드를 이용한 출력 -> import java.util 패키지 안에있음
		System.out.println("방법3");
		System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]
		
		
		
		
		

	}

}