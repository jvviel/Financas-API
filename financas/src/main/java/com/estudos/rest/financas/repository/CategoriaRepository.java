package com.estudos.rest.financas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.rest.financas.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
