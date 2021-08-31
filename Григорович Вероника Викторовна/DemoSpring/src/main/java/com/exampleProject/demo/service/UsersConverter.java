package com.exampleProject.demo.service;

import com.exampleProject.demo.dto.UsersDto;
import com.exampleProject.demo.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {
    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setFirstName(usersDto.getFirstName());
        users.setLastName(usersDto.getLastName());
        users.setPassword(usersDto.getPassword());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {
        return UsersDto.builder()
                .id(users.getId())
                .FirstName(users.getFirstName())
                .LastName(users.getLastName())
                .Password(users.getPassword())
                .build();
    }
}
