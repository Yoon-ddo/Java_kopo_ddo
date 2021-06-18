package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class SelectMain01 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String pw = "tiger";
			conn = DriverManager.getConnection(url,user,pw);
			System.out.println("DB접속 성공! " + conn);
			
			//테이블 값 가져오기.
			String sql = "select * from t_test ";
			pstmt=conn.prepareStatement(sql);
			
			//쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { // boolean 형 : 다음레코드에 값이 없으면 false반환
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : "+id+" \t| name : "+name);
			} 
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
