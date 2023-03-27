package com.artesanal.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artesanal.blog.DTO.PostDTO;
import com.artesanal.blog.entities.User;
import com.artesanal.blog.repositories.UserRepository;
import com.artesanal.blog.services.exceptions.ForbiddenException;
import com.artesanal.blog.services.exceptions.UnauthorizedException;


@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		} catch (Exception e) {
			throw new UnauthorizedException("Invalid user");
		}
		
	}
	
	public void validateAuthor(Long userId) {
		PostDTO dto = new PostDTO();
		User user = authenticated();
		if (user.getId().equals(dto.getAuthor())) {
			throw new ForbiddenException("Access denied");
		}
	}
}
