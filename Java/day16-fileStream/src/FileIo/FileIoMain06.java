package FileIo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIoMain06 {
	
	
	public static void write() {
		UserVO user = new UserVO("홍길동",26,"서울시 서초구","010-1111-2222");
		UserVO user2 = new UserVO("구길동",30,"광명시 철산동","010-3333-2222");
		UserVO user3 = new UserVO("윤소영",29,"용인시 수지구","010-5555-7777");
		
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iodata/userList.txt");
			oos = new ObjectOutputStream(fos);
			
//			for (UserVO vo : list) {
//				oos.writeObject(vo);
//			}
			
			oos.writeObject(list);
			oos.flush();				
			System.out.println("userList.txt에 저장을 완료.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(oos);
			FileClose.close(fos);
			
		}
		
	}
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<UserVO> list = new ArrayList<UserVO>();
		
		try {
			fis = new FileInputStream("iodata/userList.txt");
			ois = new ObjectInputStream(fis);
			
			list = (ArrayList<UserVO>) ois.readObject();		
			
//	         while(true) {
//	             try {
//	                UserVO user = (UserVO)ois.readObject();
//	                list.add(user);
//	             }catch(EOFException e) {
//	                break;
//	             }
//	          }
			
			System.out.println("파일로드완료...");
			
			for(UserVO vo : list) {
				System.out.println(vo);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
	}
	
	
	public static void main(String[] args) {
		//write();
		read();
	}

}
