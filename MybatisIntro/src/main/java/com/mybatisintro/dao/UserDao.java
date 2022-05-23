package com.mybatisintro.dao;

import com.mybatisintro.pojo.User;

import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-22 21:43
 */
public interface UserDao {
	List<User> getUserList();

	User getUserById(int id);

	void addUser(User user);

	void updateUser(User user);

	void deleteUser(int id);
}
