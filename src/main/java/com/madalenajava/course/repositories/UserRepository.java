package com.madalenajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalenajava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
