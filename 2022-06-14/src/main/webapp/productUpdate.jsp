<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylrsheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/product.js"></script>
</head>
<body>
<div id="wrap" align="center">
  <h1>상품수정 - 관리자 페이지</h1>
 <form method="post" enctype="multipart/form-data" name="frm">
 	<input type="hidden" name="code" value="${product.code}">
 	<input type="hidden">
 </form>
</div>
</body>
</html>