package ioStudy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import FIOUtil.FileClose;

public class FileIOMain03 {

	public static void main(String[] args) {
		FileInputStream 		fis = null;
		BufferedInputStream 	bis = null;
		FileOutputStream 		fos = null;
		BufferedOutputStream	bos = null;
		
		try {
			fis = new FileInputStream("iodata/maca.jpg");
			fos = new FileOutputStream("iodata/maca3.jpg");
			
			
		//	1) Stream열기 : 버퍼 사용 객체 연결
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
		//	2) 복사수행
			while(true) {
				int c = bis.read();
				if(c== -1) break;
				bos.write(c);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally { // close 4개해줘야행ㅜ (fis, fos, bis, bos) 
		// 	닫는 순서는 연것 순서 반대로 (bos, bis, fos, fis)
			/*
			// bis가 null이 아닐때만 닫게 해야함.
			if (bis != null) {
				try {
					bis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if (bos != null) {
				try {
					bos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if (fis != null) {
				try {
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}*/
			
			
			FileClose.close(bis,fis);
			FileClose.close(bos,fos);
			//FileClose.close(fis);
			//FileClose.close(fos);
			
		}
		
		
		
		
	}//m

}
