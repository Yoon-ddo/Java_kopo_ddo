package FIOUtil;

import java.io.InputStream;
import java.io.OutputStream;

public class FileClose {
	
	public static void close(InputStream is) { // 형변환
	
		if(is != null) {
			try {
				is.close();				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void close(OutputStream os) { // 형변환
		
		if(os != null) {
			try {
				os.close();				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void close(InputStream bis, InputStream is) {
		FileClose.close(bis);
		FileClose.close(is);
	}
	
	
	public static void close(OutputStream bos, OutputStream os) {
		FileClose.close(bos);
		FileClose.close(os);
	}
	
	
	
	
	

}//c
