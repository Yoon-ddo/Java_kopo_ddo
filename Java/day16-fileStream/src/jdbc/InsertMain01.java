package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * JDBC작업순서
 * 1. 드라이버로딩
 * 2. DB 접속 후 연결객체 얻기
 * 3. SQL문 실행할 객체 얻기
 * 4. SQL 실행 및 결과 얻기
 * 5. DB접속 해제
 */

public class InsertMain01 {

	public static void main(String[] args) {
		
		//finally에서 받으려면 밖에서 정의해주어야함.
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			//1단계 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공!");
			
			//2단계 DB연결
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("DB접속 성공! : "+conn);
			
			//3단계 SQL 객체얻기 - statement 객체 리턴
			stmt = conn.createStatement(); //sql패키지에 있는거 import해줘야함
			String sql = "insert into t_test(id, name) ";// 항상 맨뒤에 공백넣어줄것!
					sql += " values('타락파워전사', '홍길동') "; // 쿼리에 세미콜론 붙이지 않는다.
					
			//4단계 SQL 실행 및 결과얻기.
			int cnt = stmt.executeUpdate(sql); // int로 반환 (update시킨 행의 개수가 리턴됨)
			System.out.println("총 "+cnt+"개의 행이 삽입되었습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			//5단계 접속 해제 - 무조건 실행되어야 하기 때문에 - conn과 stmt둘다 close
			if(stmt != null) {
				try {
					stmt.close();					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}


	}//m

}//c
