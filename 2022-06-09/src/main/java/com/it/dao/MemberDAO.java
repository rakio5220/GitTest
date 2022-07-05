package com.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.it.dto.MemberVO;


public class MemberDAO {
	
	private MemberDAO() { }
	
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}
	
	public int userCheck(String userid, String pwd) {
		
		int result = -1;
		String sql = "select pwd from member shere userid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString("pwd").equals(pwd) &&
					rs.getString("pwd") != null) {
					result = 1;
				}else {
					result = 0;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public MemberVO getMember(String userid) {
		
		MemberVO mVo = null;
		String sql = "select * from member where userid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs =  null;
		
		try {
			
			conn =  getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs =  pstmt.executeQuery();
			
			if(rs.next()) {
				mVo = new MemberVO();
				mVo.setNum(rs.getString("num"));
				mVo.setName(rs.getString("name"));
				mVo.setPhone(rs.getString("phone"));
				mVo.setAddress(rs.getString("address"));
				mVo.setDate(rs.getInt("date"));
				mVo.setGrade(rs.getString("grade"));
				mVo.setCityNum(rs.getInt("cityNum"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return mVo;
	}
}
