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
Cookie[] cookies =request.getCookies();
String name= null;
if( cookies != null) {
		for(Cookie cookie : cookies){
			 name = cookie.getValue();
		}
		out.print(name);
%>
님 안녕하세요!!<br>
<p><a href = "quiz_logout.jsp"> 로그아웃</a></p>
<%
}else{
%>
<h2>로그인에 실패했습니다.</h2>
<p><a href = "loginForm.jsp">되돌아가기</a>
<%
}
%>
</body>
</html>