package com.springgo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springgo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}

