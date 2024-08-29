package com.madalenajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalenajava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
