package com.saeyan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.ProductDAO;
import com.sayan.dto.ProductVO;


@WebServlet({ "/ProductListServlet", "/productList.do" })
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO pDao = ProductDAO.getInstance();
		
		List<ProductVO> productlist = pDao.selectAllProducts();
		request.setAttribute("productList", productlist);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("product/productList.jsp");
		dispatcher.forward(request, response);
	}
}
