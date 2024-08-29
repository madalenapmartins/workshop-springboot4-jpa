package com.madalenajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalenajava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
