package com.project.main.home.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class Home_DAOImpl implements Home_DAO{

	@Autowired
	private SqlSession sqlSession;
	
}
