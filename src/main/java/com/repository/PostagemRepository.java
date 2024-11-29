package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Integer>{

	List<Postagem> findAll();
	
}
