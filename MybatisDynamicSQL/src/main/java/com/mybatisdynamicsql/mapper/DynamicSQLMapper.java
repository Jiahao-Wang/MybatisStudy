package com.mybatisdynamicsql.mapper;

import com.mybatisdynamicsql.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-06-03 13:11
 */
public interface DynamicSQLMapper {
	
	// 多条件查询
	List<Emp> getEmpByCondition(Emp emp);
	
	// 测试 choose when otherwise
	List<Emp> getEmpByChoose(Emp emp);
	
	// 通过数组实现批量删除
	int deleteByArray(@Param("eids") Integer[] eids);
	
	// 通过 list 集合实现批量添加
	int insertByList(@Param("emps") List<Emp> emps);
}
