package com.exampleProject.demo.service;

import com.exampleProject.demo.dto.UsersDto;

import java.util.List;

public interface UsersService {
    UsersDto saveUser(UsersDto usersDto) throws Exception;

    void deleteUser(Integer userId);

    UsersDto findByLastName(String lastName);

    List<UsersDto> findAll();
}
