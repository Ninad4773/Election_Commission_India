package com.eci.services;

import com.eci.entities.User;

public interface UserService {
	public User login(String email);
	public User authenticate(String email, String password);
}
