package FileIo;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIoMain02 {
	
	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("=====================================================");
			System.out.println("\t사용법 : FIleIoMain01   원본파일명   복사할파일명");
			System.out.println("=====================================================");
			System.exit(0);
		}
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("D:/윤소영/java-workspace/java/day16/Suup/iodata/"+ args[0]);
			fw = new FileWriter("D:/윤소영/java-workspace/java/day16/Suup/iodata/"+ args[1]);
			
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
