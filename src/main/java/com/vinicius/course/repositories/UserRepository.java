package com.vinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
