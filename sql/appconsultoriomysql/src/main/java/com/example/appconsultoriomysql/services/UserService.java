package com.example.appconsultoriomysql.services;


import com.example.appconsultoriomysql.entities.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void deleteUser(Long id);

    User findUser(Long id);

    List<User> getUsers();

//    void updateUser(User user);
}
