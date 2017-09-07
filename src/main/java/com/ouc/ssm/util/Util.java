package com.ouc.ssm.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
*@title：Util.java
* @author：被抛弃的猫咪
* @version：1.0
* @date：2017年6月12日 上午10:21:55
* @description：
*/
public class Util {
	//SqlSession sqlSession = null;
  public static SqlSession getSqlSession() throws IOException{
	//mybatis 的配置文件
			String resource = "SqlMapConfig.xml";
			//得到流文件
			 InputStream inputStream = Resources.getResourceAsStream(resource);
			//创建绘画工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			//通过工厂的到sqlSession
			 SqlSession sqlsession = sqlSessionFactory.openSession();
	  
	  
	return sqlsession;
	  
  }
}
