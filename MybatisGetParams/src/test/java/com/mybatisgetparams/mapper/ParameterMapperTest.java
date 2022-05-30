package com.mybatisgetparams.mapper;

import com.mybatisgetparams.pojo.User;
import com.mybatisgetparams.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-23 10:04
 */
public class ParameterMapperTest {

	@Test
	public void getAllUsersTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		List<User> userList = parameterMapper.getAllUsers();

		for (User user : userList) {
			System.out.println(user);
		}

		sqlSession.close();
	}

	@Test
	public void getUserByIdTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		User user = parameterMapper.getUserById(2);

		System.out.println(user);

		sqlSession.close();
	}

	@Test
	public void checkLoginTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		User user = parameterMapper.checkLogin("zhangsan", "222");

		System.out.println(user);

		sqlSession.close();
	}

	@Test
	public void checkLoginByMapTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);

		Map<String, Object> map = new HashMap<>();
		map.put("username", "zhangsan");
		map.put("pwd", "123");

		User user = parameterMapper.checkLoginByMap(map);

		System.out.println(user);
		sqlSession.close();
	}

	@Test
	public void addUserTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);

		parameterMapper.addUser(new User(4, "laoliu", "2333"));

		sqlSession.close();
	}

	@Test
	public void getUserByParamTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		User user = parameterMapper.getUserByParam(2);

		System.out.println(user);

		sqlSession.close();
	}

	@Test
	public void getUserByIdToMapTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		Map<String, Object> map = new HashMap<>();
		map = parameterMapper.getUserByIdToMap(2);

		System.out.println(map);

		sqlSession.close();
	}

	@Test
	public void getAllUsersToMapTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		Map<String, Object> map = new HashMap<>();
		map = parameterMapper.getAllUsersToMap();

		System.out.println(map);

		sqlSession.close();
	}
}
