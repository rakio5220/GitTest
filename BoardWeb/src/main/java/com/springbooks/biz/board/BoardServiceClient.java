package com.springbooks.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		BoardVO vo = new BoardVO();
//		vo.setTitle("홍길동전");
//		vo.setWriter("허균");
//		vo.setContent("아비를 아비라 부르지못하고...");
//		boardService.insertBoard(vo);
		
		List<BoardVO> boadList = boardService.getBoardList(vo);
		for (BoardVO board : boadList) {
			System.out.println("--->" + board.toString());
		}
		
		container.close();
	}

}
