package com.artesanal.blog.DTO;

import java.io.Serializable;

import com.artesanal.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Getter @Setter @NonNull private Long id;
	@Getter @Setter @NonNull private String name;
	@Getter @Setter @NonNull private String email;
	
	

	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
	}

}

