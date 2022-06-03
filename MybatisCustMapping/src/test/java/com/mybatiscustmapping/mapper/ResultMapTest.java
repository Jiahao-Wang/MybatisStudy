package com.mybatiscustmapping.mapper;

import com.mybatiscustmapping.pojo.Dept;
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

		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		List<Emp> empList = empMapper.getAllEmp();

		for (Emp emp : empList) {
			System.out.println(emp);
		}

		sqlSession.close();
	}

	@Test
	public void getEmpAndDeptTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = empMapper.getEmpAndDept(2);
		
		System.out.println(emp);
		sqlSession.close();
	}
	
	@Test
	public void getEmpAndDeptByStepTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = empMapper.getEmpAndDeptByStep1(2);
		
		System.out.println(emp);
		sqlSession.close();
	}
	
	@Test
	public void getDeptAndEmpTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
		Dept dept = deptMapper.getDeptAndEmp(2);
		
		System.out.println(dept);
		sqlSession.close();
	}
	
	@Test
	public void getDeptAndEmpByStepTest(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		
		DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
		Dept dept = deptMapper.getDeptAndEmpByStep1(2);
		
		System.out.println(dept);
		sqlSession.close();
	}
}
