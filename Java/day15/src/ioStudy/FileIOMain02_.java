package ioStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 파일 복사 작업순서
 * 1. Stream 열기.
 * 2. Read / Write
 * 3. Stream 닫기.
 */
public class FileIOMain02 {

	public static void main(String[] args) {
		
		//FileOutputStream fos = new FileOutputStream("iodata/aa.txt"); // default경로는 프로젝트 파일(src, bin 있는곳)
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
		//	1. Stream 열기
			fis = new FileInputStream("iodata/maca.jpg");
			fos = new FileOutputStream("iodata/maca2.jpg"); // 아직은 사진이 전부 복사된 것이 아님.
			
		// 2. Read / Write
			while(true) {// 파일끝까지 읽기
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			System.out.println("복사완료웅...");
			
			//데이터의 일관성을 위해 내가 읽고있는 중에는 남이 수정하면 안돼유.
			// sw가 종료되면 lock해제.
			//while(true); // 콘솔 끄기전에는 복사안됨.ㅋㅋ
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
		//	3. Stream 해제 - 자원을 해제하는 코드는 반드시 finally에 있어야함.
		//  fis, fos를 바깥에 선언해야하는 이유 : finally에서 못씀
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}//m

}
