package com.exampleProject.demo.repository;

import com.exampleProject.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersRepository extends JpaRepository <Users, Integer> {

    Users findByLastName(String lastName);
}
