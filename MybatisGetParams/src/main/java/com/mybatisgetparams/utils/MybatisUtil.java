package com.mybatisgetparams.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jiahao Wang
 * @Description 根据官网写这些配置文件就行。以后不用再动这里了
 * @create 2022-05-22 21:36
 */
public class MybatisUtil {

	private static SqlSessionFactory sqlSessionFactory;

	static {
		try {

			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession(true);
	}
}
