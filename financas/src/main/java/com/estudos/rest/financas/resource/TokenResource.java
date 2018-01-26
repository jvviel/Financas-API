package com.estudos.rest.financas.resource;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.rest.financas.config.property.FinancasProperty;

@RestController
@RequestMapping("/logout")
public class TokenResource {
	
	@Autowired
	private FinancasProperty financasProperty;

	@DeleteMapping("/removerToken")
	public void removerToken(HttpServletRequest req, HttpServletResponse resp){
		Cookie cookie = new Cookie("refreshToken", null);
		cookie.setHttpOnly(true);
		cookie.setSecure(financasProperty.getSeguranca().getEnableHttps()); // em produção true
		cookie.setPath(req.getContextPath() + "/oauth/token");
		cookie.setMaxAge(0);
		
		resp.addCookie(cookie);
		resp.setStatus(HttpStatus.NO_CONTENT.value());
	}
}
