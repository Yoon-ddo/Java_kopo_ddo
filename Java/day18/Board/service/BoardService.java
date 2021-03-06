package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.dao.BoardDAODB;
import kr.ac.kopo.vo.BoardVO;

//서비스가 DAO를 호출하기 위해
public class BoardService {
	
	//private BoardDAO dao;
	private BoardDAODB dao;
	
	public BoardService() {
		//dao = new BoardDAO();
		dao = new BoardDAODB();
	}
	
	public void 새글등록서비스(BoardVO newBoard) throws Exception{
		// 등록할 게시물 번호 추출,
		newBoard.setNo(BoardSequence.getNo());
		// 등록 날짜 추출
		String pattern = "yyyy-MM-dd hh:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		newBoard.setRegDate(sdf.format(new Date()));

		dao.새글등록(newBoard);
	}
	
	public List<BoardVO> 전체게시글조회서비스() throws Exception {
		List<BoardVO> list = dao.전체게시글조회();
		return list;
	}
}
