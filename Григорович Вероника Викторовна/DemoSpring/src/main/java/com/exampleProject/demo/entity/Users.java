package com.exampleProject.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
    @Table(name = "user_names")
    @Data
    @NoArgsConstructor
    public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column
        private String firstName;

        @Column
        private String lastName;

        @Column
        private String password;
    }

