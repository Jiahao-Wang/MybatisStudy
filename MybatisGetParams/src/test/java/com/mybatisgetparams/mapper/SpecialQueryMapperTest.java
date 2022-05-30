package com.mybatisgetparams.mapper;

import com.mybatisgetparams.pojo.User;
import com.mybatisgetparams.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-23 21:39
 */
public class SpecialQueryMapperTest {
	@Test
	public void getUserByLikeTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		SpecialQueryMapper specialQueryMapper = sqlSession.getMapper(SpecialQueryMapper.class);
		List<User> userList = specialQueryMapper.getUserByLike("li");

		for (User user : userList) {
			System.out.println(user);
		}

		sqlSession.close();
	}

	@Test
	public void deleteInTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		SpecialQueryMapper specialQueryMapper = sqlSession.getMapper(SpecialQueryMapper.class);
		specialQueryMapper.deleteIn("4, 5");



		sqlSession.close();
	}

	@Test
	public void getUserByTableNameTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		SpecialQueryMapper specialQueryMapper = sqlSession.getMapper(SpecialQueryMapper.class);
		List<User> userList = specialQueryMapper.getUserByTableName("user");

		for (User user : userList) {
			System.out.println(user);
		}

		sqlSession.close();
	}

	@Test
	public void insertUserTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		SpecialQueryMapper specialQueryMapper = sqlSession.getMapper(SpecialQueryMapper.class);

		User user = new User("laoliu", "000");
		System.out.println(user);

		specialQueryMapper.insertUser(user);



		sqlSession.close();
	}
}
