package HwReview;

import java.util.ArrayList;
import java.util.List;

/*
 * 기본자료형		Wrapper 클래스[기본자료형을 참조자료형으로 변형시켜준 것]
 * boolean		Boolean
 * byte 		Byte
 * char			Character
 * short		Short	
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 */
public class WrapperMain {

	public static void main(String[] args) {
		
		//Wrapper class
		List<Integer> list = new ArrayList<>();
		
		
		int i = 123;
		Integer i2 = new Integer(123);
		Integer i3  = 123;
		//auto boxing : 자동으로 클래스 인스턴스 객체에 넣음
		int i4 = new Integer(123);
		//auto unboxing : 객체형태에서 자료만 뽑아내는 것.
		
		
		String str = "10234";
		int num2 = Integer.parseInt(str); 
		int num = Integer.valueOf(str); // valueOf : 참조자료형 리턴
		// 예전엔 달랐지만 지금은 구분없이 사용함.
		System.out.println(num+100+","+num2+100);
		
		
		

	}

}
