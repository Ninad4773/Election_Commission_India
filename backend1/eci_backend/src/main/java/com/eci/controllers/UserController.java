package com.eci.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eci.entities.User;
import com.eci.models.Credentials;
import com.eci.models.Response;
import com.eci.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<?> authenticate(Credentials cred) {
		User user = userService.authenticate(cred.getEmail(), cred.getPassword());
		System.out.println(user);
		if (user != null)
			return Response.success(user);
		return Response.success("User not found");
	}
}
