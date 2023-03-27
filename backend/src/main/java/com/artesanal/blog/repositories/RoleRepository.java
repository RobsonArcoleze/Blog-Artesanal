package com.artesanal.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artesanal.blog.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}

