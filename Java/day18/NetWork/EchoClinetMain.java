package NetWork;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClinetMain {

	public static void main(String[] args) {
		
		try {
			
			Socket socket = new Socket("192.168.217.57",10001);
			// 키보드로 입력받을 객체 Scanner sc = new Scanner(System.in);
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
														// 키보드로 입력받은 것 문자로 바꿔줌
			
			// 클라이언트가 "키보드로 입력받은 데이터를" 서버에게 데이터 전달.
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os); // 문자로 바꿔주는것.
			PrintWriter pw = new PrintWriter(osw); // print쓰고싶어서 사용
			
			// 서버에서 재전송한 데이터를 수신 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				System.out.print("메세지 입력(quit입력 시 종료) : ");
				String msg = keyboard.readLine();
				if(msg.equals("quit")) {
					System.out.println("소켓통신을 종료합니다.");
					socket.close();
					break;
				}
				//pw에 메시지 전달.
				pw.println(msg);
				pw.flush();
				
				//서버에서 날아온 메시지 출력
				String echoMsg = br.readLine();
				System.out.println("서버에서 전송한 메시지는 : " + echoMsg);
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
