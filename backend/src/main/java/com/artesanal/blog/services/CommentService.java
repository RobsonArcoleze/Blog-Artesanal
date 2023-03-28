package com.artesanal.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artesanal.blog.DTO.CommentDTO;
import com.artesanal.blog.entities.Comment;
import com.artesanal.blog.repositories.CommentRepository;
import com.artesanal.blog.services.exceptions.DataBaseException;
import com.artesanal.blog.services.exceptions.ResourceNotFoundException;


@Service
public class CommentService {

	
	@Autowired
	private CommentRepository commentRepository;
	
	
	
	@Transactional(readOnly = true)
	public Page<CommentDTO> findAllPaged(Pageable pageable){
		Page <Comment> list = commentRepository.findAll(pageable);
		return list.map(x -> new CommentDTO(x));
	}
	
	@Transactional
	public CommentDTO insert(CommentDTO dto, Long id) {
		Comment entity = new Comment();
		entity.setComment(dto.getComment());
		entity.setAuthor(dto.getAuthor());
		//entity.setPost(new Post(id, null, null, null, null, id));
		entity = commentRepository.save(entity);
		return new CommentDTO(entity);
	}
	
	public void delete(Long id) {
		try{
			commentRepository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found  " + id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataBaseException("Integrity violation");
		}
	}
}
