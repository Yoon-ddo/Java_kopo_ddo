package NetWork;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClientMain {

	public static void main(String[] args) {
		
		try {
			// 3) 서버와 상호통신할 수 있도록 소켓생성
			Socket socket = new Socket("localhost",10000);
			// 서버 실행하지 않으면 10000번 포트가 없음 -- > 클라이언트 소켓 생성하면 accept됨
			
			// 4-2) 서버가 전송한 메시지 받기
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			// utf-8형식으로 메시지 받기
			String msg = dis.readUTF();
			System.out.println("서버에서 받은 메시지 : "+msg);
			
			// 5) 소켓 끊기
			socket.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
