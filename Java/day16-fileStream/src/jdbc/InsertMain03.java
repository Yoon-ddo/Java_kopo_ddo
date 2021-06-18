package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * JDBC작업순서
 * 1. 드라이버로딩
 * 2. DB 접속 후 연결객체 얻기
 * 3. SQL문 실행할 객체 얻기
 * 4. SQL 실행 및 결과 얻기
 * 5. DB접속 해제
 */

public class InsertMain03 {

	public static void main(String[] args) {
		
		//finally에서 받으려면 밖에서 정의해주어야함.
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
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
			
			
			/*3단계 SQL 객체얻기 - statement 객체 리턴
			 * 내가 원하는 사용자 입력 id, 이름 넣기 ::: PreparedStatement
			 */
			System.out.print("ID를 입력 : ");
			String id = sc.nextLine();
			System.out.print("이름을 입력 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name) ";
				sql += " values(?, ?) ";
			pstmt = conn.prepareStatement(sql);// stmt도 가능 : 묵시적 형변환 일어남.
			//자동으로 ''를 붙여주어 (?, ?)에 넣어줌. int는 setInt(a,b)
		
			pstmt.setString(1, id);
			pstmt.setString(2, name);
					
			//4단계 SQL 실행 및 결과얻기.
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"개 행 삽입");
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			//5단계 접속 해제 - 무조건 실행되어야 하기 때문에 - conn과 pstmt둘다 close
			if(pstmt != null) {
				try {
					pstmt.close();					
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
			sc.close();
			
		}


	}//m

}//c
