package ExceptionStudy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("a.txt");
			// 빨간줄 : 컴파일 시점의 예외처리, 무조건, checked exception			
		} catch(FileNotFoundException fnfe) {
			
			try {
				FileWriter fw = new FileWriter("error.log");
				
			}catch(IOException ie){
				ie.printStackTrace();
				
			}
			
		}
		
		

	}

}
