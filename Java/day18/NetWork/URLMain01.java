package NetWork;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLMain01 {

	public static void main(String[] args) {
		
		try {
			URL urlObj = new URL("https://www.naver.com");
			System.out.println("프로토콜 : "+urlObj.getProtocol());
			System.out.println("호스트명 : "+urlObj.getHost());
			System.out.println("포트 : "+urlObj.getPort());
			System.out.println("경로 : "+urlObj.getPath());
			System.out.println("쿼리 : "+urlObj.getQuery());
			
			System.out.println("------------------------------------------");
			/*
			InputStream is = urlObj.openStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8"); // encoding
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			}
			*/
			
			URLConnection uc = urlObj.openConnection();
			InputStream is = uc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8"); // encoding
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
