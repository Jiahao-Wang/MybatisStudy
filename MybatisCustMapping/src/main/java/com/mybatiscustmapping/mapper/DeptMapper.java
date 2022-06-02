package com.mybatiscustmapping.mapper;

import com.mybatiscustmapping.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-31 18:42
 */
public interface DeptMapper {
	
	Dept getEmpAndDeptByStep2(@Param("did") Integer did);
}
