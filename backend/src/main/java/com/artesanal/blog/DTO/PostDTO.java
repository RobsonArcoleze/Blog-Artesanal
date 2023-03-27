package com.artesanal.blog.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	@Getter @Setter @NonNull private String img;
	@Getter @Setter @NonNull private String url;
	@Getter @Setter @NonNull private Long author;
	@Getter private List<CommentDTO> comments = new ArrayList<>();
	
	public PostDTO(Post entity) {
		id = entity.getId();
		title = entity.getTitle();
		body = entity.getBody();
		img = entity.getImg();
		url = entity.getUrl();
		author = entity.getAuthor();
		entity.getComments().forEach(comment -> this.comments.add(new CommentDTO(comment)));
	}
	
}
