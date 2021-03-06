package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {
	public static void main(String[] args) {
		
		try {
			//1. JDBC드라이버 로딩 - 반드시 try~ catch 사용
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
			
			/*2. DB접속 및 연결객체 얻기
			 *  url(jdbc:oracle:thin:@IP:SDI), ID, PW
			 */
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.119.119:1521:dink","scott","tiger");
			System.out.println("DB접속성공 : "+conn);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}//m
}//c
