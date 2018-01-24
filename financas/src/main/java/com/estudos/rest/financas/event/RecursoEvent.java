package com.estudos.rest.financas.event;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursoEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;
	private HttpServletResponse response;
	private Integer codigo;

	public RecursoEvent(Object source, HttpServletResponse response, Integer codigo) {
		super(source);
		this.response = response;
		this.codigo = codigo;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	
	

}
