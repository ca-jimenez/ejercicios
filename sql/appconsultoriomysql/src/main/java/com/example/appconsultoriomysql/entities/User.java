package com.example.appconsultoriomysql.entities;

import lombok.Data;


import javax.persistence.*;

@Entity
@Data
@Table(name = "users", schema = "test_jpa")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String dni;
    private String name;

    @Column(name = "last_name")
    private String lastName;
}
