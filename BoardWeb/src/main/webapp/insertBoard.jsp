<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>새글등록</title>
</head>
<body>
<center>
<h1>글등록</h1>
<a href="logout_proc.jsp">Log-out</a>
<hr>
<form action="insertBoard.do" method="post">
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="orange" width="70">제목</td><td align="left">
		<input type="text" name="title"/></td>
	</tr>
	<tr>
		<td bgcolor="orange">작성자</td><td align="left">
		<input type="text" name="writer"/></td>
	</tr>
	<tr>
		<td bgcolor="orange">내용</td><td align="left">
		<textarea name="content" rows="10" cols="40"></textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value=" 새글 등록"/></td>
	</tr>
</table>
</form>
<hr>
<a href="getBoardList.do">글목록가기</a>
</center>
</body>
</html>