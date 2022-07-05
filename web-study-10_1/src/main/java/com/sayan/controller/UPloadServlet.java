package com.sayan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet({ "/UPloadServlet", "/upload.do" })
public class UPloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String savePath = "upload";
		int uploadFileSizeLimit = 5 * 1024 * 1024;
		String encType = "utf-8";
		
		try {
			MultipartRequest multi = new MultipartRequest(request, encType, uploadFileSizeLimit, encType, new DefaultFileRenamePolicy());
			String fileName =  multi.getFilesystemName("uploadFile");
			
			if(fileName == null) {
				System.out.print("파일이 업로드 되지 않았음");
			}else {
				out.println("<br> 글쓴이 : " +multi.getParameter("name"));
				out.println("<br> 제 &nbsp; 목 : " + multi.getParameter("title"));
				out.println("<br> 파일명 : " +fileName);
			}
		}catch(Exception e) {
			System.out.print("예외 발생 : " +e);
		}
	}

}
