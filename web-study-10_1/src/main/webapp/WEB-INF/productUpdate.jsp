<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품관리</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/product.js"></script>
</head>
<body>
<div id="wrap" align="center">
<h1>상품 수정 - 관리자 페이지</h1>
<form method="post" enctype="multipart/form-data" name="frm">
	<input type="hidden" name="code" value="${product.code }">
	<input type="hidden" name="nonmakeImg" value="${product.pictureurl }">
	<table>
		<tr>
			<td>
				<c:choose>
					<c:when test="${empty product.pictureurl }">
						<img src="upload/noimage.gif">
					</c:when>
					<c:otherwise>
						<img src="upload/${product.pictureurl }">
					</c:otherwise>
				</c:choose>
	</table>
</form>
</div>
</body>
</html>