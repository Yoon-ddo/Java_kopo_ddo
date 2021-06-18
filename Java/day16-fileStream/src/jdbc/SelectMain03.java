package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionFactory;

public class SelectMain03 {

	public static void main(String[] args) {
		
		
		// pstmt로 받기 전에 sql문이 있어야하므로 밖에 선언
		String sql = "select * from t_test ";
		
		try(
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql); 
		){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : "+ id +" \t| name : "+name);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
