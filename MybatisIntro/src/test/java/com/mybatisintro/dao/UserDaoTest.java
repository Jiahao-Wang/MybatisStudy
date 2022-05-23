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
	public void getUserListTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		UserDao userDao = sqlSession.getMapper(UserDao.class);
		List<User> userList = userDao.getUserList();

		for (User user : userList) {
			System.out.println(user);
		}

		sqlSession.close();
	}

	@Test
	public void getUserByIdTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		UserDao userDao = sqlSession.getMapper(UserDao.class);
		User user = userDao.getUserById(1);

		System.out.println(user);

		sqlSession.close();
	}

	@Test
	public void addUserTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		UserDao userDao = sqlSession.getMapper(UserDao.class);
		userDao.addUser(new User(4, "maliu", "000"));

		// 增删改必须要提交事物
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void updateUserTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		UserDao userDao = sqlSession.getMapper(UserDao.class);
		userDao.updateUser(new User(4, "Jackie", "999"));

		// 增删改必须要提交事物
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void deleteUserTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		UserDao userDao = sqlSession.getMapper(UserDao.class);
		userDao.deleteUser(4);

		// 增删改必须要提交事物
		sqlSession.commit();
		sqlSession.close();
	}

}
