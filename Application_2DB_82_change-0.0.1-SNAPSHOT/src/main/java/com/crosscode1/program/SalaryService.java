package com.crosscode1.program;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crosscode1.program.repository.UserRepository;
import com.crosscode1.program.salrepository.SalaryRepository;
import com.crosscode1.program.salrepository.UserSalary;

/**
 * @author ankit.tripathi
 *
 */
@Service
public class SalaryService {
	@Autowired
	SalaryRepository salaryRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public void saveSalary(UserSalary salary){
		
		salaryRepository.save(salary);
	}
	
	public List<UserSalary> getUserSalary(){
		
		return (List<UserSalary>) salaryRepository.findAll();
		
				
	}
	
public List<UserSalary> getSalaryWithUserName(){
		
		List<UserSalary> userSalaryList = new ArrayList<UserSalary>();
		
		for(UserSalary userSalary:(List<UserSalary>) salaryRepository.findAll()){
			userSalary.setUsername(userRepository.findOne(userSalary.getUserid()).getUsername());
			userSalaryList.add(userSalary);
		}
		return userSalaryList;
		
		
	}

}
