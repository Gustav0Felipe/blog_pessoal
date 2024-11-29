package com.model;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Table(name = "tb_temas")
@Entity
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tema;
	
	@NotNull
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tema", cascade = CascadeType.REMOVE )
	@JsonIgnoreProperties("tema")
	private Collection<Postagem> postagem;

	public Long getId() {
		return id_tema;
	}

	public void setId(Long id_tema) {
		this.id_tema = id_tema;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(Collection<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	
}
