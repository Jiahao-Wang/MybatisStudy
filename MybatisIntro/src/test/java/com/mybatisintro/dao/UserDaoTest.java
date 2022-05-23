package com.mybatisintro.dao;

import com.mybatisintro.pojo.User;
import com.mybatisintro.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-22 21:58
 */
public class UserDaoTest {

	@Test
	public void test(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		UserDao userDao = sqlSession.getMapper(UserDao.class);
		List<User> userList = userDao.getUserList();

		for (User user : userList) {
			System.out.println(user);
		}

		sqlSession.close();
	}
}
