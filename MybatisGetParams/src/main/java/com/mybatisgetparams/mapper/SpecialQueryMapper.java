package com.mybatisgetparams.mapper;

import com.mybatisgetparams.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-23 21:36
 */
public interface SpecialQueryMapper {

	List<User> getUserByLike(@Param("name") String name);

	void deleteIn(@Param("ids") String ids);

	List<User> getUserByTableName(@Param("tableName") String tableName);

	void insertUser(User user);
}
