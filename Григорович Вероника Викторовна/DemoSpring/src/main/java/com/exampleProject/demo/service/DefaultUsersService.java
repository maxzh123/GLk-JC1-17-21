package com.exampleProject.demo.service;

import com.exampleProject.demo.dto.UsersDto;
import com.exampleProject.demo.entity.Users;
import com.exampleProject.demo.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;
@Service
@AllArgsConstructor
public class DefaultUsersService implements UsersService{
    private final UsersRepository usersRepository;
    private final UsersConverter usersConverter;


    @Override
    public UsersDto saveUser(UsersDto usersDto) throws Exception {
        validateUserDto(usersDto);
        Users savedUser = usersRepository.save(usersConverter.fromUserDtoToUser(usersDto));
        return usersConverter.fromUserToUserDto(savedUser);
    }

    private void validateUserDto(UsersDto usersDto) throws Exception {
        if (isNull(usersDto)) {
            throw new Exception("Object user is null");
        }
        if (isNull(usersDto.getLastName()) || usersDto.getLastName().isEmpty()) {
            throw new Exception("LastName is empty");
        }
    }

    @Override
    public void deleteUser(Integer userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public UsersDto findByLastName(String lastName) {
        Users users = usersRepository.findByLastName(lastName);
        if (users != null) {
            return usersConverter.fromUserToUserDto(users);
        }
        return null;
    }

    @Override
    public List<UsersDto> findAll() {
        return usersRepository.findAll()
                .stream()
                .map(usersConverter::fromUserToUserDto)
                .collect(Collectors.toList());
    }
}

