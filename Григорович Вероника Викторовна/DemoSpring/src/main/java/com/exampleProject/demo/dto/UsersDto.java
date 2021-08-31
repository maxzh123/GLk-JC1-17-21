package com.exampleProject.demo.dto;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class UsersDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String password;

}
