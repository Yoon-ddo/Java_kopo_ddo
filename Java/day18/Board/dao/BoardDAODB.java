package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.Util.ConnectionFactory;
import kr.ac.kopo.Util.JDBCClose;
import kr.ac.kopo.vo.BoardVO;

// 게시판 관리하는 클래스
public class BoardDAODB {
	private List<BoardVO> list;

	public BoardDAODB() {
		list = new ArrayList<>();
	}
	
	public List<BoardVO> 전체게시글조회() throws Exception{
		List<BoardVO> tmp = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, writer, to_char(reg_date, 'yyyy-mm-dd') as reg_date ");
			sql.append(" from tbl_board ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
				
				BoardVO board = new BoardVO(no, title, writer, regDate);
				tmp.add(board);
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return tmp;
	}	
	
	public BoardVO 글번호조회(int no) throws Exception {
		return null;
	}
	
	public void 새글등록(BoardVO newBoard) throws Exception{
		List<BoardVO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into tbl_board(no, title, writer) ");
			sql.append(" values(seq_tbl_board_no.nextval, ?, ?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newBoard.getTitle());
			pstmt.setString(2, newBoard.getWriter());
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	public void 게시글수정(BoardVO board) throws Exception{
		
	}
	
	public void 게시글삭제(int no) throws Exception{
		
		
	}

}//c
