package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserDAO {
	void save(User obj);
	List<User> findAll();

}
