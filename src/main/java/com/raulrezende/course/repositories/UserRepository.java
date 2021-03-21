package com.raulrezende.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raulrezende.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
