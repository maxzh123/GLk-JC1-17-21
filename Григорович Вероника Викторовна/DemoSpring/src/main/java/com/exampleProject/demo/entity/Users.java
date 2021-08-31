package com.exampleProject.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
    @Table(name = "user_names")
    @Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
    @NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
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

