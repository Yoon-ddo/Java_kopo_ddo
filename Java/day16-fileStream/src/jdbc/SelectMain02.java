package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionFactory;
import Util.JDBCClose;


public class SelectMain02 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
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
			JDBCClose.close(conn, pstmt);
		}

	}

}
