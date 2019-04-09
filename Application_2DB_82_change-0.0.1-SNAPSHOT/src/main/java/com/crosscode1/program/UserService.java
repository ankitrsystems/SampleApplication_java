package com.crosscode1.program;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crosscode1.program.repository.User;
import com.crosscode1.program.repository.UserRepository;


/**
 * @author ankit.tripathi
 *
 */
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> getUser(){
		System.out.println((List<User>) userRepository.findAll());
		return (List<User>) userRepository.findAll();
		
	
		
	}

}
