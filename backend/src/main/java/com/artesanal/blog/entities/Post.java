package com.artesanal.blog.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter @NonNull private Long id;
	
	@Size(min = 5, message = "O título não pode ter menos que 5 caracteres!")
	@Getter @Setter @NonNull private String title;

	@Size(min = 10, message = "O conteúdo não pode ter menos que 10 caracteres!")
	@Getter @Setter @NonNull private String body;
	
	@OneToMany(mappedBy = "post")
	@Getter private List<Comment> comments = new ArrayList<>();
}

