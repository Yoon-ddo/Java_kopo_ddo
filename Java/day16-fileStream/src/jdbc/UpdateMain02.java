package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * 수정할 ID입력 : hong
 * 수정할 이름입력 : 홍길순
 */

public class UpdateMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String pw = "tiger";
			conn = DriverManager.getConnection(url,user,pw);
			
			
			//3단계 : ID입력받기
			System.out.print("ID를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.print("수정할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			StringBuilder sql = new StringBuilder();
			sql.append("update t_test ");
			sql.append(" set name = ? ");
			sql.append(" where id = ? ");
			// StringBuilder -> String
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, name); // 첫번째 물음표에 name
			pstmt.setString(2, id); // 두번째 물음표에 id

			
			//4단계
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행을 수정했습니다.");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//5단계
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
