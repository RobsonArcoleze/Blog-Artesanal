package com.artesanal.blog.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "tb_post")
public class Post implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter @NonNull private Long id;
	
	@Size(min = 5, message = "O título não pode ter menos que 5 caracteres!")
	@Getter @Setter @NonNull private String title;

	@Size(min = 10, message = "O conteúdo não pode ter menos que 10 caracteres!")
	@Column(columnDefinition = "TEXT")
	@Getter @Setter @NonNull private String body;
	
	@Column(columnDefinition = "TEXT")
	@Getter @Setter @NonNull private String img;
	
	@Column(columnDefinition = "TEXT")
	@Getter @Setter @NonNull private String url;
	
	
	@OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
	@Getter private List<Comment> comments = new ArrayList<>();
	
	@Getter @Setter @NonNull private Long author;

}

