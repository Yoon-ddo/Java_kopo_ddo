package FileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIoMain05 {
	
	public static void write() throws Exception {
		UserInfo user = new UserInfo("홍길동",25,"서울시 서초구");
		FileOutputStream fos = new FileOutputStream("D:/윤소영/java-workspace/java/day16/Suup/iodata/userInfo_obj.txt");
		// FileOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(user);
		oos.flush();
		System.out.println("userInfo.txt에 저장을 완료.");
	}
	
	
	public static void read() throws Exception{
		FileInputStream fis = new FileInputStream("D:/윤소영/java-workspace/java/day16/Suup/iodata/userInfo_obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		UserInfo user = (UserInfo)ois.readObject();
		System.out.println("파일로드완료...");
		System.out.println(user);
		
		
	}
	
	public static void main(String[] args) {
		try {
			//write();
			read();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
