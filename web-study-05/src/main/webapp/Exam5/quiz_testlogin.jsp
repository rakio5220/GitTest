<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = "wjdalsgh9";
String pwd = "1426413a";
String name = "정민호";

if(id.equals(request.getParameter("id")) &&
		pwd.equals(request.getParameter("pwd")) ){
		Cookie cookie = new Cookie("username", "정민호");
			cookie.setMaxAge(365*24*60*60);
			response.addCookie(cookie);
			%>
			<h2>성공적으로 로그인하셨습니다.</h2>
			<p> <a href = "quiz_main.jsp"> 들어가기 </a>
	<%
	}else{
		%>
<h2>로그인에 실패했습니다.</h2>
<p> <a href="quiz_loginForm.jsp">되돌아가기</a>
<%
}
%>
</body>
</html>