package com.artesanal.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artesanal.blog.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
