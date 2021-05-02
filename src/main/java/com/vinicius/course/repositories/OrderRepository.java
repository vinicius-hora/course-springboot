package com.vinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
