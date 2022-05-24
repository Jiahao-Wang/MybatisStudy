package com.mybatisgetparams.mapper;

import com.mybatisgetparams.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-23 10:01
 */
public interface ParameterMapper {

	List<User> getAllUsers();

	User getUserById(int id);

	User checkLogin(String name, String pwd);

	User checkLoginByMap(Map<String, Object> map);

	void addUser(User user);

	User getUserByParam(@Param("userId") int id);

	Map<String, Object> getUserByIdToMap(@Param("id") int id);

	@MapKey("id")
	Map<String, Object> getAllUsersToMap();
}
