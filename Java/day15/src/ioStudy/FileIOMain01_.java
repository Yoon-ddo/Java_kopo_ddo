package ioStudy;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args)  {
		System.out.println("입력하세요. ctrl+z를 누르면 종료됩니다.");
		
		InputStream is = System.in;
		/*
		while(true) {
			int c = is.read();
			
			if (c == -1) { // c가 -1이면 아무것도 입력받지 않았다는 뜻이므로
				break; //탈출
			}
			System.out.print((char)c); // 명시적형변환 근데 한글이 안나와!
		}*/
		
		InputStreamReader isr = new InputStreamReader(is);
		// int c = isr.read(); // .read();를 쓰기 위해서는 예외처리해줘야함 (try, catch)
		try {
			while(true) {
				int c = isr.read();
				if (c == -1) break;
				System.out.print((char)c);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		

		
		
		
		
		
		
		
	}//m

}
