package FileIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIoMain03 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;

		
		try {
			fr = new FileReader("D:/윤소영/java-workspace/java/day16/Suup/iodata/FileIOMain04.java");
			fw = new FileWriter("D:/윤소영/java-workspace/java/day16/Suup/iodata/FileIOMain04_2.java.txt");
			
			// 필터클래스 끼워넣기.
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				
				String data = br.readLine(); // null로 리턴
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			
			bw.flush();
			System.out.println("파일복사를 완료했습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br,bw); // 필터클래스 먼저  close
			FileClose.close(fr,fw);
		}

	}

}
