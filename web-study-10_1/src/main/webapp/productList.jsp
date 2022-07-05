<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<title>상품관리</title>
</head>
<body>
<div id="wrap" align="center">
<h1>상품리스트 - 관리자 페이지</h1>
<table class="list">
	<tr>
		<td colspan="5" style="border: white; text-align: right">
			<a href="productWrite.do">
			<button type="button" class="btn btn-info">상품등록</button>
			</a>
		</td>
	</tr>
	
	<tr>
	<th>번호</th>
	<th>이름</th>
	<th>가격</th>
	<th>수정</th>
	<th>삭제</th>
	</tr>
	
	<c:forEach var="product" items="${productList}">
	<tr class="record">
		<td> ${product.code} </td>
		<td> ${product.name} </td>
		<td> ${product.price} 원 </td>
		<td>
			<a href="productUpdate.do?code=${product.code}">상품 수정</a>
		</td>
		<td>
			<a href="productDelete.do?code=${product.code}">상품 삭제</a>
		</td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>