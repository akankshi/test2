package com.example.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	private static Logger LOGGER=LoggerFactory.getLogger(UserService.class);
	
	public String registerUser(User user){
		LOGGER.info("Entered Service Class");
		String regResult=userRepo.registerUser(user);
		return regResult;
	}
}
