package com.artesanal.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_comment")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter @NonNull private Long id;
	
	@Size(min = 5, message = "O comentário não pode ter menos que 5 caracteres!")
	@Getter @Setter @NonNull private String comment;
	
	@ManyToOne
	@JoinColumn(columnDefinition = "post_id")
	@Getter @Setter @NonNull private Post post;
}
