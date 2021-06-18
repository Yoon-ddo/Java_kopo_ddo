package MoonjaYeol;

import java.util.Arrays;
import java.util.Scanner;

public class MoonJa02 {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("[ " + str + " ]의 길이 : "+str.length());
		for(int i = 0; i<str.length(); i++) {
			System.out.println((i+1) + "번째에 위치한 문자 : "+ str.charAt(i));
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력 : ");
		/*
		String input = sc.nextLine(); // "A"
		char c = input.charAt(0);		
		*/
		// 두줄은 아래의 한줄로 요약할 수 있다.
		char c = sc.nextLine().charAt(0);
		//System.out.println(c);
		
		
		
		// 문자를 배열에 하나씩 저장하고 싶은데요
		char[] chars = new char[str.length()];
		/*
		for(int i = 0; i<str.length(); i++) {
			chars[i] = str.charAt(i);
		}*/
		//for문은 아래의 한줄로 요약할 수 있다.
		str.getChars(0, str.length(), chars, 0); // str 배열의 0번지에서 ~str.length()-1번지(끝)까지를 chars배열 0부터 채워준다. 
		System.out.println(Arrays.toString(chars));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
