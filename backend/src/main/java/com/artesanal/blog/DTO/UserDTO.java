package com.artesanal.blog.DTO;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

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
	
	@NotBlank(message = "Campo Obrigatório")
	@Getter @Setter @NonNull private String name;
	
	@Email(message = "Favor colocar um email válido")
	@Getter @Setter @NonNull private String email;
	
	@Getter private Set<RoleDTO> roles = new HashSet<>();
	
	

	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
	}

}

