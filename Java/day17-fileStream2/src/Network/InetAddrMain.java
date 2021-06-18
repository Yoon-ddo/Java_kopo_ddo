package Network;

import java.net.InetAddress;

public class InetAddrMain {
	public static void main(String[] args) {
		
		try {
			
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("내컴터 네트워크이름\t: "+localhost.getHostName());
			System.out.println("내컴터 IP주소\t: "+localhost.getHostAddress());
			System.out.println("내컴터 네트워크이름, IP주소 : "+localhost.toString());
			System.out.println();
			
			// 특정 사이트의 IP 주소
			InetAddress Addr = InetAddress.getByName("www.hanati.co.kr");
			System.out.println("하금티 IP\t: "+Addr.getHostAddress());
			System.out.println();
			
			// 상대방 IP도 알 수 있음.
			InetAddress[] Addrs = InetAddress.getAllByName("www.naver.com");
			System.out.println("------------------------------");
			System.out.println("\t네이버 IP 주소");
			System.out.println("------------------------------");
			for(InetAddress address : Addrs) {
				System.out.println(address);
			}
			System.out.println("------------------------------");
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
