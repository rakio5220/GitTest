package com.ezen.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatatisMain {
	
	public static void main(String[] args) {
	String resource = "com/ezen/mybatis/mybatis-config.xml";
	InputStream inputStream = null;
	try {	
		inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		System.out.println("sqlSessionFactory : " + sqlSessionFactory);
		System.out.println(" session : " + session);
		BoardMethod mapper = session.getMapper(BoardMethod.class);
		
		
//		BoardVO vo = mapper.selectOne(1);
//		System.out.println(vo.getId());
//		System.out.println(vo.getName());
//		System.out.println(vo.getPhone());
//		System.out.println(vo.getAddress());
		//mapper.deleteBoard(5);
//		BoardVO vo3 = new BoardVO();
//		vo3.setId(10);
//		vo3.setName("김연아");
//		vo3.setPhone("010-1234-5678");
//		vo3.setAddress("서울");
//		
//		mapper.insertboard(vo3);
		
		
		session.commit();
		
		List<BoardVO> list = mapper.selectAllMember();
		for(BoardVO vo2 : list)
			System.out.println(vo2.toString());
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	/**/
	}
	
}
