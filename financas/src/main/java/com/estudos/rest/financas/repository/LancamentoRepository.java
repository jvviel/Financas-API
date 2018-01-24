package com.estudos.rest.financas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.rest.financas.model.Lancamento;
import com.estudos.rest.financas.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Integer>, LancamentoRepositoryQuery{

	
}
