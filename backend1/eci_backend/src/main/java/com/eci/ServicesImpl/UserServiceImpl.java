package com.eci.ServicesImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eci.daos.UserDao;
import com.eci.entities.User;
import com.eci.services.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;

	@Override
	public User login(String email) {
		return this.userdao.findByEmail(email);
	}

	@Override
	public User authenticate(String email, String password) {
		User user = this.login(email);
		if(user != null && user.getPassword().equals(password))
			return user;
		return null;
	}

}
