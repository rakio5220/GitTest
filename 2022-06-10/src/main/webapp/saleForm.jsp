<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/common.css"/>
<title>Insert title here</title>
</head>
<body>
	<%@ include file ="header.jsp" %>
	
	<section>
		<h2>회원매출조회</h2>
		<table>
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>고객등급</th>
				<th>매출</th>
			</tr>
			<tr>
				<td><input type="text" id="id" name="id" size="10"></td>
				<td><input type="text" id="name" name="name" size="10"></td>
				<td><input type="text" id="grade" name="grade" size="15"></td>
				<td><input type="text" id="sale" name="sale" size="10"></td>
			</tr>
		</table>
	</section>
		
		<%@include file="footer.jsp" %>
</body>
</html>