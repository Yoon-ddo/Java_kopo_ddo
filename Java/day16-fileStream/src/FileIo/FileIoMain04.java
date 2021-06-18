package FileIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIoMain04 {
	public static void write() throws Exception {
		UserInfo user = new UserInfo("홍길동",25,"서울시 서초구");
		FileWriter fw = new FileWriter("D:/윤소영/java-workspace/java/day16/Suup/iodata/userInfo.txt");
		//BufferWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		
		
		pw.println(user.getName());
		pw.println(user.getAge());
		pw.println(user.getAddr());
	
		pw.flush();
		FileClose.close(pw);
		FileClose.close(fw);
		
		System.out.println("userInfo.txt에 저장을 완료했습니다.");
	}
	
	public static void read() throws Exception{
		FileReader fr = new FileReader("D:/윤소영/java-workspace/java/day16/Suup/iodata/userInfo.txt");
		BufferedReader br = new BufferedReader(fr);
		String name = br.readLine();
		int age = Integer.parseInt(br.readLine());
		String addr =br.readLine();
	}
	
	public static void main(String[] args) {
		try {
			write();
			//read();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
