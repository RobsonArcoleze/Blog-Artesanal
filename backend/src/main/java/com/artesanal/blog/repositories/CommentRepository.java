package com.artesanal.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artesanal.blog.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
