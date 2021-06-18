package Subject;

import java.util.Arrays;

public class Arr04 {

	public static void main(String[] args) {
		// String 배열 만들기
		String[] strArr = {"폴리텍","데이터분석", "자바"};
		System.out.println("배열의 크기 : "+strArr.length);
		System.out.println("첫번째 문자열 : " +  strArr[0]);
		
		// 배열출력 <방식1>
		for (int i = 0; i<strArr.length; i++) {
			System.out.println(i+1 + "번째 문자열 : " +  strArr[i]);
		}
		// 배열출력 <방식2> - 전체 출력시
		for (String str: strArr) {
			System.out.print(str+"  ");
		} System.out.println();
		// 배열출력 <방식3> - Arrays.toString()
		System.out.println(Arrays.toString(strArr));
	}

}
