package com.crosscode1.program.salrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author ankit.tripathi
 *
 */
@Repository
public interface SalaryRepository extends JpaRepository<UserSalary, Long>{
	
}
