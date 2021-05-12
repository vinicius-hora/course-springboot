package com.vinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
