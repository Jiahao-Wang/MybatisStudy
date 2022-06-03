package com.mybatiscustmapping.mapper;

import com.mybatiscustmapping.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-31 18:42
 */
public interface EmpMapper {

	List<Emp> getAllEmp();
	
	Emp getEmpAndDept(@Param("eid") Integer eid);
	
	Emp getEmpAndDeptByStep1(@Param("eid") Integer eid);
	
	List<Emp> getDeptAndEmpByStep2(@Param("did") Integer did);
	
}
