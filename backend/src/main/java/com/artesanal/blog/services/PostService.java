package com.artesanal.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artesanal.blog.DTO.CommentDTO;
import com.artesanal.blog.DTO.PostDTO;
import com.artesanal.blog.entities.Comment;
import com.artesanal.blog.entities.Post;
import com.artesanal.blog.repositories.CommentRepository;
import com.artesanal.blog.repositories.PostRepository;
import com.artesanal.blog.services.exceptions.DataBaseException;
import com.artesanal.blog.services.exceptions.ResourceNotFoundException;


@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	
	
	@Transactional(readOnly = true)
	public Page<PostDTO> findAllPaged(Pageable pageable){
		Page <Post> list = repository.findAll(pageable);
		return list.map(x -> new PostDTO(x));
	}
	
	@Transactional
	public PostDTO insert(PostDTO dto) {
		Post entity = new Post();
		entity.setTitle(dto.getTitle());
		entity.setBody(dto.getBody());
		entity.setImg(dto.getImg());
		entity.setUrl(dto.getUrl());
		entity.setAuthor(dto.getAuthor());
		for(CommentDTO commentDTO : dto.getComments()) {
			Comment comment = commentRepository.getReferenceById(commentDTO.getId());
			entity.getComments().add(comment);
		}
		entity = repository.save(entity);
		return new PostDTO(entity);
	}
	
	public void delete(Long id) {
		
		
		try{
			repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found  " + id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataBaseException("Integrity violation");
		}
	}
}
