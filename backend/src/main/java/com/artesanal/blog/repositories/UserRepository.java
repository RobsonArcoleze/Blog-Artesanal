package com.artesanal.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artesanal.blog.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String username);
}
