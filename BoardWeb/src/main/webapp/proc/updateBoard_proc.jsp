<%@page import="org.springframework.stereotype.Repository"%>
<%@page import="com.springbooks.biz.board.impl.BoardDAO" %>
<%@page import="com.springbooks.biz.board.BoardVO" %>
<%@page contentType="text/html; charset=UTF-8"%>

<%
	//1. 사용자 입력 정보 추출
	request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String seq = request.getParameter("seq");
	
	//2. DB 연동 처리
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setContent(content);
	vo.setSeq(Integer.parseInt(seq));
	
	//3. 화면 네비게이션
	response.sendRedirect("getBoardList.jsp");
%>