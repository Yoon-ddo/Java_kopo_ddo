package MoonJaYeol;

public class Stringmain04 {

	public static void main(String[] args) {
		
		/*
		long start = System.currentTimeMillis();
		String str = "";
		for(int i = 0; i < 100000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : "+(end-start) / 1000.0 + "초");
		*/
		//속도가 3초가 넘어갈정도로 느리다.
		
		// StringBuffer()로 성능을 개선할 수 있다.
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer(); // 비어있는 문자열
		for(int i = 0; i<100000; i++) {
			sb.append(i); // stringBuffer()에 i 넣어줌.
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : "+(end-start) / 1000.0 + "초");
		
		

	}

}
