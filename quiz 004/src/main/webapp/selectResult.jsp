<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String edu = request.getParameter("edu");
String na = request.getParameter("na");
String[] likes = request.getParameterValues("like");
%>
	당신의 학력 :
		<b><%=edu %></b><br>
		당신의 국가
		<b><%=na %></b><br>
		당신의 관심분야 :
		<% for(String like : likes) { %>
		<b><%=like %></b>
		<% } %>
</body>
</html>