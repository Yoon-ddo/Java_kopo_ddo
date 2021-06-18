package NetWork;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {

	public static void main(String[] args) {
		
		try {
			// 1) 서버객체생성
			ServerSocket server = new ServerSocket(10000); // 10000번이후의 소켓사용할것!
			System.out.println("어플리케이션 서버 실행...");
			
			// 2) 클라이언트의 요청 기다림
			Socket client = server.accept(); // 계속 콘솔이 실행중이게 된다.
			//client 소켓accept한 객체를 서버에 생성.
			System.out.println("연결된 클라이언트 정보 : "+client.getInetAddress());//client만 써도 OK
			
			//전달하고 싶은 메시지
			String msg = "접속을 환영합니다!";
			// 4-1) 메시지를 클라이언트에 전송 :: Output
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			// utf-8 방식으로 메시지 전송
			dos.writeUTF(msg);
			dos.flush();
			// new OutputStreamWriter(os,"utf-8"); :: 이렇게 전송할 경우 client에서도 InputStreamReader로 받아줘야함.
			
			// 5) 소켓 끊기
			client.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
