package com.itemsharing.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itemsharing.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
