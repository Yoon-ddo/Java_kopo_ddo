package FileIo;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIoMain01 {
	
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		
		try {
			fr = new FileReader("D:/윤소영/java-workspace/java/day16/Suup/iodata/FileIOMain04.java");
			fw = new FileWriter("D:/윤소영/java-workspace/java/day16/Suup/iodata/FileIOMain04.java.txt");
			while(true) {
				int c = fr.read();
				if(c == -1) break;
				fw.write(c);
			}
			
			fw.flush();
			System.out.println("파일복사를 완료했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fr,fw);
		}
	}


}
