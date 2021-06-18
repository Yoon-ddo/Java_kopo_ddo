package MoonjaYeol;

public class MoonJa01 {

	public static void main(String[] args) {
		String str = new String();
		
		char[] chars = {'A','B','C','D','E','F'};
		String str2 = new String(chars);
		String str3 = new String(chars, 1,3); // 범위지정도 가능.
			
		System.out.println("str : ["+ str +"]");
		System.out.println("str : ["+ str2 +"]");
		System.out.println("str : ["+ str3 +"]");
		
		
		// byte배열 안의 숫자를 아스키코드값으로 받아 문자로 입력해주세요.
		byte[] bytes = {97,98,99,100,101};
		String str4 = new String(bytes);
		System.out.println("str : ["+ str4 +"]");
		
		// 차이가 있다.
		String str5 = new String("Hello");
		String str6 = "Hello";
		System.out.println("str : ["+ str5 +"]");
		System.out.println("str : ["+ str6 +"]");
		


	}

}
