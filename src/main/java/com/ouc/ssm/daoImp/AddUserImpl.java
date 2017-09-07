package com.ouc.ssm.daoImp;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ouc.ssm.bean.User;
import com.ouc.ssm.dao.AddUser;
import com.ouc.ssm.util.Util;

/**
*@title：AddUserImpl.java
* @author：被抛弃的猫咪
* @version：1.0
* @date：2017年9月6日 下午2:48:29
* @description：
*/
public class AddUserImpl implements AddUser{
	public boolean addUser(User user) {
		SqlSession sqlSession;
		boolean flag = false;
		try {
			sqlSession = Util.getSqlSession();
			int temp = sqlSession.insert("test.addUser",user);
			List list = sqlSession.selectList("test.selectAll");
			sqlSession.commit();
			if(temp>0){
				flag = true;
			}
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flag;
	
		

		
	} 
	public List<User> SelectUser() throws IOException {
		SqlSession sqlSession;
        List<User> list;
			sqlSession = Util.getSqlSession();
			list = sqlSession.selectList("test.selectAll");
			sqlSession.close();		
		return list;	
	} 
	
	}

	

