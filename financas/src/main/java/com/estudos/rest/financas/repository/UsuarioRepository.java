package com.estudos.rest.financas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.rest.financas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	public Optional<Usuario> findByEmail(String email);
}
