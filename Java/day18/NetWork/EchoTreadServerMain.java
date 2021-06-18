package NetWork;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread{//클라이언트와 대화하는 스레드
	private Socket socket;
	public EchoThread(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {//Socket객체를 넘겨줘야 수신하고 전달할 수 있음
		try {
			InetAddress client = socket.getInetAddress();
			System.out.println("client : "+client);
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("["+client.getHostAddress()+"]와의 접속을 종료합니다.");
					socket.close();
					break;
				}
				System.out.println("["+client.getHostAddress()+"]에서 받은 메시지 : "+msg);
				pw.println(msg);
				pw.flush();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
public class EchoTreadServerMain {
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("EchoThreadServer 시작 ...");
			
			while(true) {
				//client수만큼 accept하기 위해서는 while문 안에 넣어줘야함
				Socket client = server.accept();
				EchoThread et = new EchoThread(client);
				et.start(); // 스레드 실행
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
