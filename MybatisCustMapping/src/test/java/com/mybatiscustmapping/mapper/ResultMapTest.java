package com.mybatiscustmapping.mapper;

import com.mybatiscustmapping.pojo.Emp;
import com.mybatiscustmapping.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-31 18:45
 */
public class ResultMapTest {

	@Test
	public void getAllEmpTest() {
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		EmpMapper specialQueryMapper = sqlSession.getMapper(EmpMapper.class);
		List<Emp> empList = specialQueryMapper.getAllEmp();

		for (Emp emp : empList) {
			System.out.println(emp);
		}

		sqlSession.close();
	}

	@Test
	public void getEmpAndDeptTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		EmpMapper specialQueryMapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = specialQueryMapper.getEmpAndDept(2);
		
		System.out.println(emp);
		sqlSession.close();
	}
	
	@Test
	public void getEmpAndDeptByStepTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		EmpMapper specialQueryMapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = specialQueryMapper.getEmpAndDeptByStep1(2);
		
		System.out.println(emp);
		sqlSession.close();
	}
}
