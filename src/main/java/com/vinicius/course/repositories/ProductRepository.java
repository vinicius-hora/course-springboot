package com.vinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
