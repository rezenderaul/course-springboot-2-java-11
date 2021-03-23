package com.raulrezende.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raulrezende.course.entities.User;
import com.raulrezende.course.services.UserService;

@RestController // Annotation que informa que a classe é recurso web implementado por um controlador rest
@RequestMapping(value = "/users") // Nome do recurso / rota web
public class UserResource {

	@Autowired
	private UserService service; // Dependência do Service
	
	@GetMapping // indica que o método responde requisição do tipo get do HTTP
	public ResponseEntity<List<User>> findAll() {
		// ResponseEntity -> Tipo específico do Spring para retornar respostas de requisições web
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		// .ok -> retorna a resposta com sucesso no HTTP
		// .body -> retorna o corpo da resposta, no caso, contendo um usuário u 
	}

	@GetMapping(value="/{id}") // Indica que a requisição aceita um parâmetro na URL
	public ResponseEntity<User> findById(@PathVariable Long id) {
		// PathVariable - Para o Spring aceitar como parâmetro
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
