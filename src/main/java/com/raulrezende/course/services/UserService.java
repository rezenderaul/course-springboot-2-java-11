package com.raulrezende.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raulrezende.course.entities.User;
import com.raulrezende.course.repositories.UserRepository;

@Service // Registra como um serviço do Spring
public class UserService {

	@Autowired
	private UserRepository repository; // Dependência do Repository
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
