package com.madalenajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalenajava.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}