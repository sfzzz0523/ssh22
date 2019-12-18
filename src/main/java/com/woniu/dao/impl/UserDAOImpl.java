package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;
@Repository
public class UserDAOImpl implements IUserDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(User obj) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createCriteria(User.class).list();
	}

}
