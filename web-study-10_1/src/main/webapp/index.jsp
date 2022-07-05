<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="util.*"%>
<%
   RequestDispatcher dispatcher = request.getRequestDispatcher("productList.do");
	dispatcher.forward(request, response);
%>