package com.raulrezende.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raulrezende.course.entities.Order;
import com.raulrezende.course.repositories.OrderRepository;

@Service // Registra como um serviço do Spring
public class OrderService {

	@Autowired
	private OrderRepository repository; // Dependência do Repository
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
