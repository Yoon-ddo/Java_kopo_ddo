package kr.ac.kopo.day15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain04 {

	public static void write() {
		
		char c = 'A';
		int i = 97;
		double d = 12.34;
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		
		try {
			fos = new FileOutputStream("iodata/test.dat");
			dos = new DataOutputStream(fos);
			
			dos.writeChar(c);
			dos.writeInt(i);
			dos.writeDouble(d);
		} catch (Exception e) {
			// TODO: handle exceptions
		}finally {
			FileClose.close(dos, fos);
		}
		
	}
	
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("iodata/test.dat");
			dis = new DataInputStream(fis);
			
			char c = dis.readChar();
			int i = dis.readInt();
			double d= dis.readDouble();
			System.out.println("읽온 데이터 출력");
			System.out.println("문자 : " + c);
			System.out.println("정수 : " + i);
			System.out.println("실수 : " + d);
			
					
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			FileClose.close(dis, fis);
		}
	
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		write();
		read();
		

		
		
	}

}
