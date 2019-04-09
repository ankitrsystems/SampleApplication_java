package com.crosscode1.program.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author ankit.tripathi
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
		
}
