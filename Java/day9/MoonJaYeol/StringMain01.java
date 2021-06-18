package MoonJaYeol;

public class StringMain01 {

	public static void main(String[] args) {
		
		//String str = "Hello"; 
		//String str2 = "hello";
		String str = new String("Hello");
		String str2 = new String("hello");
		
		// 주소만 비교함
		if(str == str2) {
			System.out.println("Str == str2");
		}else {
			System.out.println("Str != str2");
		}
		
		
		
		boolean bool = str.equals(str);
		if (bool) {
			System.out.println("equals() : str == str2");
		} else {
			System.out.println("equals() : str != str2");
		}
		
		
		bool = str.equalsIgnoreCase(str2);
		if (bool) {
			System.out.println("equalsIgnoreCase() : str == str2");
		} else {
			System.out.println("equalsIgnoreCase() : str != str2");
		}
		
		
		
		
		str = "hello!!!";
		str2 = "hello world!";
		
		String sub = "hello"; //찾고싶은 문자열
		bool = str.startsWith(sub);
		
		if (bool) {
			System.out.println("[" + str + "]은 ["+sub+"]문자열로 시작한다.");
		} else {
			System.out.println("[" + str + "]은 ["+sub+"]문자열로 시작하지 않는다.");
		}
		
		
		
		
		str = "hello.txt";
		bool = str.endsWith(".txt");
		if (bool) {
			System.out.println("[" + str + "]은 텍스트파일입니다.");
		} else {
			System.out.println("[" + str + "]은 텍스트파일이 아니다.");
		}
		
		
		// 순서비교는 길이와비교가 아니(unicode)
		str= "boat";
		str2 = "board";
		
		int compare = str.compareTo(str2);
		
		if(compare == 0) {
			System.out.println(str+ "==" + str2);
		} else if(compare<0) {
			System.out.println(str+ "<" + str2);
		} else {
			System.out.println(str+ ">" + str2);
		}
		
		
		
		String[] names = {"강감찬", "박명수", "홍길동","윤길동","홍마떡","홍익점"};
		System.out.println("< 이름 홍길동인 사람 >");
		for(int i = 0; i<names.length;i++) {
			if(names[i].equals("홍길동")) {
				System.out.print(names[i]);
			}
		}System.out.println();
		
		
		
		System.out.println("<  성이 홍씨인 사람 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.print(name+" ");
			}
		}System.out.println();
		
		
		System.out.println("<  이름이 길동인 사람 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.print(name+" ");
			}
		}System.out.println();
		
		
		System.out.println("<  홍이 포함된 사람 >");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.print(name+" ");
			}
		}System.out.println();
		
		
		
		
		System.out.println("< indexOf >---------------------------------");
		
		str = "Hello world";
		int searchIdx = str.indexOf("o"); // 앞에서부터 o의 인덱스 찾기
		System.out.println("o의 indexOf(\"o\") 위치는 : "+searchIdx);
		// 근데 Hello에만 o가 있는게 아니고 world에도 o가 있다.
		searchIdx = str.indexOf("o",5);
		System.out.println("o의 indexOf(\"o\",5) 위치는 : "+searchIdx);
		
		searchIdx = str.lastIndexOf("o"); // 뒤에서부터 o의 인덱스 찾기
		System.out.println("o의 lastIndexOf() 위치는 : "+searchIdx);
		
		
		
		
		//Hello world에서 "l"의 위치
		str = "Hello world";
		char ch = 'l';
		System.out.println("< " + str + "에서" + ch + "위치 >--------------------------");
		int lIdx = str.indexOf(ch); // 위치없으면 -1나옴 = -1전까지 찾으면 되겟군!
		while(lIdx != -1) {
			System.out.println("검색된 위치 : "+lIdx);
			lIdx = str.indexOf(ch, lIdx+1);
			
		}
		// -----------------------------------------------------------------------------
		// int lIdx = str.indexOf(ch);
		
		// lIdx+1 = 0이 되어야 하므로 초기값을 -1로 지정해주었다.
		lIdx = -1;
		while((lIdx = str.indexOf(ch, lIdx+1)) != -1) { // indexOf로 먼저 비교하고 lIdx에 넣은 후 조건에 만족할 때 까지 while문
			System.out.println("검색된 위치 : "+lIdx);
		}
		
		
		
		System.out.println("< " + str + "에서" + ch + "위치 >--------------------------");
		// 뒤에서부터 비교
		lIdx = 1;
		while((lIdx = str.lastIndexOf(ch, lIdx-1)) != -1) {
			System.out.println("검색된 위치 : "+lIdx);
		}
					

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
