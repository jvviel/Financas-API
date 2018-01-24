package com.estudos.rest.financas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.rest.financas.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
}
