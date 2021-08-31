package com.exampleProject.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
    @Table(name = "UserNames")
    @Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
    @NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
    public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer Id;

        @Column
        private String FirstName;

        @Column
        private String LastName;

        @Column
        private String Password;
    }

