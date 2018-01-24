package com.estudos.rest.financas.repository.lancamento;

import java.util.List;

import com.estudos.rest.financas.model.Lancamento;
import com.estudos.rest.financas.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
