package com.artesanal.blog.DTO;

import java.io.Serializable;

import com.artesanal.blog.entities.Comment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@RequiredArgsConstructor
public class CommentDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Getter @Setter @NonNull private Long id;
	@Getter @Setter @NonNull private String comment;
	@Getter @Setter @NonNull private PostDTO postId;
	@Getter @Setter @NonNull private Long author;
	
	public CommentDTO(Comment entity) {
		id = entity.getId();
		comment = entity.getComment();
		postId = new PostDTO(entity.getPost());
		author = entity.getAuthor();
	}
	
}
