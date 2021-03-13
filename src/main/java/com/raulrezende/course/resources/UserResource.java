package com.raulrezende.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raulrezende.course.entities.User;

@RestController // Annotation que informa que a classe é recurso web implementado por um controlador rest
@RequestMapping(value = "/users") // Nome do recurso / rota web
public class UserResource {

	@GetMapping // indica que o método responde requisição do tipo get do http
	public ResponseEntity<User> findAll() {
		// ResponseEntity -> Tipo específico do Spring para retornar respostas de requisições web
		User u = new User(1L, "Maria", "maria@Gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
		// .ok -> retorna a resposta com sucesso no http
		// .body -> retorna o corpo da resposta, no caso, contendo um usuário u 
	}
}
