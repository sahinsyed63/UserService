package com.example.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user_service.model.User;
import com.example.user_service.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> users = userService.getAllUser();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	@GetMapping("/msg")
	public String msg() {
		return "hi";
	}
	
	@PostMapping
	public ResponseEntity createUser(@RequestBody User user) {
	     User users = userService.createUser(user);
		return new ResponseEntity<>(users,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/hi")
	public String getUser() {
		return "welcome to tadipatri";
	}

}
