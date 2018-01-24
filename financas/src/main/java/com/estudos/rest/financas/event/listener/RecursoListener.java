package com.estudos.rest.financas.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.estudos.rest.financas.event.RecursoEvent;

@Component
public class RecursoListener implements ApplicationListener<RecursoEvent>{

	@Override
	public void onApplicationEvent(RecursoEvent recursoEvent) {
		
		HttpServletResponse response = recursoEvent.getResponse();
		Integer codigo = recursoEvent.getCodigo();
		
		adicionarHeaderLocation(response, codigo);
	}

	private void adicionarHeaderLocation(HttpServletResponse response, Integer codigo) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(codigo).toUri();
		response.setHeader("Location", uri.toASCIIString());
	}

}
