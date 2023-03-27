package com.artesanal.blog.DTO;

import java.io.Serializable;

import com.artesanal.blog.entities.Post;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
public class PostDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Getter @Setter @NonNull private Long id;
	@Getter @Setter @NonNull private String title;
	@Getter @Setter @NonNull private String body;
	
	public PostDTO(Post entity) {
		id = entity.getId();
		title = entity.getTitle();
		body = entity.getBody();
	}
}
