package com.raulrezende.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.raulrezende.course.entities.User;
import com.raulrezende.course.repositories.UserRepository;

@Configuration // Informamos aos Spring, que é uma classe de configuração
@Profile("test") // Configuração específica para o perfil test
public class TestConfig implements CommandLineRunner{
	
	@Autowired // O Spring vai controlar a dependência automaticamente
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// Tudo que estiver dentro desse metódo será executado quando a aplicação for iniciada
		// Os id's estão nulos, pois serão gerados pelo banco de dados
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		// saveAll salva uma lista no banco de dados
		// Arrays.asList cria uma lista de array
	}
}
