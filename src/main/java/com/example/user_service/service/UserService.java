package com.example.user_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user_service.model.User;
import com.example.user_service.repository.UserRepositroy;

@Service
public class UserService {
	
	@Autowired
	private UserRepositroy userRepository;
	
	public List<User> getAllUser() {
		List<User> user = userRepository.findAll();
		return user;
		
	}
	
	public User createUser(User user) {
		User users=userRepository.save(user);
		return users;
		
		}
	

}
