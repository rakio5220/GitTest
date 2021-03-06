package com.springbooks.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbooks.biz.board.BoardService;
import com.springbooks.biz.board.BoardVO;
import com.springbooks.biz.common.Log4jAdvice;
import com.springbooks.biz.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl  implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	//public BoardServiceImpl() {
		//log = new Log4jAdvice();
	//}
	
	public void insertBoard(BoardVO vo) {
		//log.printLogging();
		boardDAO.insertBoard(vo);
	}
	
	public void updateBoard(BoardVO vo) {
		//log.printLogging();
		boardDAO.updateBoard(vo);
	}
	public void deleteBoard(BoardVO vo) {
		//log.printLogging();
		boardDAO.deleteBoard(vo);
	}
	public BoardVO getBoard(BoardVO vo) {
		//log.printLogging();
		return boardDAO.getBoard(vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo) {
		//log.printLogging();
		return boardDAO.getBoardList(vo);
	}


}
