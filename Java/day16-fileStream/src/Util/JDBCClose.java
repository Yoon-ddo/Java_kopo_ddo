package Util;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCClose {
	public static void close(Connection conn, Statement pstmt) { // 묵시적형변환으로 pre,statement 둘다 사용가능
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
