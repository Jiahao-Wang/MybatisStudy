package com.mybatisdynamicsql.mapper;

import com.mybatisdynamicsql.pojo.Dept;
import com.mybatisdynamicsql.pojo.Emp;
import com.mybatisdynamicsql.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-06-03 13:17
 */
public class DynamicSQLTest {
	
	@Test
	public void getEmpByConditionTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
		List<Emp> emps = dynamicSQLMapper.getEmpByCondition(new Emp(null,"张三",null,null,null));
		
		System.out.println(emps);
		sqlSession.close();
	}
	
	@Test
	public void getEmpByChooseTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
		Emp emp = new Emp(null, "张三", 18, null, null);
		List<Emp> emps = dynamicSQLMapper.getEmpByChoose(emp);
		
		System.out.println(emps);
		sqlSession.close();
	}
	
	@Test
	public void deleteByArrayTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
		int result = dynamicSQLMapper.deleteByArray(new Integer[]{9,10});
		
		System.out.println(result);
		sqlSession.close();
	}
	
	@Test
	public void insertByListTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
		Emp emp1 = new Emp(null, "a", 18, "男", "123");
		Emp emp2 = new Emp(null, "a", 18, "男", "123");
		Emp emp3 = new Emp(null, "a", 18, "男", "123");
		
		List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
		
		int result = dynamicSQLMapper.insertByList(emps);
		
		System.out.println(result);
		sqlSession.close();
	}
}
