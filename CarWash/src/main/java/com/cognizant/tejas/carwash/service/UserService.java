package com.cognizant.tejas.carwash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.tejas.carwash.model.User;

@Service
public interface UserService {

	//this method is used for to add user data in Database(OnlineTailoring System)
		public boolean addUser(User user);
		
		//this method is used to fetch User data from Database(OnlineTailoring System)
		public List<User> read();
	
	
	
}
