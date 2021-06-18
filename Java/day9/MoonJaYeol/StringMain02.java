package MoonJaYeol;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {
		String str = "hello world";
		
		System.out.println();
		System.out.println("substring------------------------------------------------");
		String substr = str.substring(1,6);// 1포함 5 전까지
		System.out.println(str + " --.substring(1,5)--> [" + substr+"]"); 
		substr = str.substring(3); // 3부터 끝까지
		System.out.println(str + " --.substring(3)--> [" + substr+"]");
		
		
		System.out.println();
		System.out.println("concat------------------------------------------------");
		String str1 = "Hello";
		String str2 = "!!!!!";
		str = str1.concat(str2);
		System.out.println("concat(str1,str2) 결과 : " + str);
		
		
		System.out.println();
		System.out.println("replace------------------------------------------------");
		str = "hello world";
		System.out.println("replace()전 결과 : "+str);
		str = str.replace('l', 'r'); // l이면 전부 r로 바꿔준다.
		System.out.println("replace후() 결과 : "+str);
		str = str.replace("rr", "l"); // 문자열로도 치환할 수 있다.
		System.out.println("replace후() 결과 : "+str);
		
		
		System.out.println();
		System.out.println("trim---------------------------------------------------");
		//trim 좌우 공백 없애기
		str = "   hello   ";
		System.out.println("trim()전 결과 : ["+str+"]의 길이 : "+str.length());
		str = str.trim();
		System.out.println("trim()후 결과 : ["+str+"]의 길이 : "+str.length());
		
		
		System.out.println();
		System.out.println("toLower/UpperCase---------------------------------------");
		str = "Hello World!";
		System.out.println("str : "+ str);
		System.out.println("toLowerCase() : "+str.toLowerCase());
		System.out.println("toUpperCase() : "+str.toUpperCase());


		System.out.println();
		System.out.println("split---------------------------------------------------");
		str = "홍길동전:허균:조선시대";
		String[] strArr = str.split(":");
		System.out.println(str + " --split(\":\")--> "+Arrays.toString(strArr));
		
		String ip = "192.168.5.203";
		String[] ipArr = ip.split(".");
		System.out.println(ip+ " --split(\".\")--> "+Arrays.toString(ipArr)); 
		// ipArr은 왜 빈리스트일까?
		// split()에 입력한 "."은 인식하지 못하기 때문에 "\\."을 입력해야한다.
		ipArr = ip.split("\\.");
		System.out.println(ip+ " --split(\".\")--> "+Arrays.toString(ipArr)); 
		
		
		
		
		
		
		
	}

}
