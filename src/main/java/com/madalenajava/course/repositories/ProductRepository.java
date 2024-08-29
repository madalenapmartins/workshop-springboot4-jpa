package com.madalenajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalenajava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
