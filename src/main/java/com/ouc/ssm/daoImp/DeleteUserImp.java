package com.ouc.ssm.daoImp;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.ouc.ssm.dao.DeleteUser;
import com.ouc.ssm.util.Util;

/**
*@title：DeleteUserImp.java
* @author：被抛弃的猫咪
* @version：1.0
* @date：2017年9月7日 上午9:53:04
* @description：
*/
public class DeleteUserImp implements DeleteUser {

	public void deleteUser(int id) throws IOException {
			SqlSession sqlSession = Util.getSqlSession();
			sqlSession.delete("test.deleteUser",id);
			sqlSession.commit();
			sqlSession.close();
		
	}

}
