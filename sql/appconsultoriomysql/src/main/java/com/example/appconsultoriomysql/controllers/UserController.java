package com.example.appconsultoriomysql.controllers;

import com.example.appconsultoriomysql.entities.User;
import com.example.appconsultoriomysql.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    private String saveUser(@RequestBody User user) { //faltaria crear UserDTO para transferencia y mappear a entity para db
        userService.saveUser(user);
        return "guardado con éxito"; // reemplazar con response entity
    }

    @GetMapping("/find/{id}")
    private User findUser(@PathVariable Long id) {
        return userService.findUser(id);
    }

    @PatchMapping("/update/{id}") //actualizar un registro si no es el objeto entero
    private String update1(@PathVariable Long id, @RequestParam String name, @RequestParam String lastname) {

        User user = userService.findUser(id); //hacer en el service
        user.setName(name); //validar
        user.setLastName(lastname); //validar
        userService.saveUser(user); //como ya tiene id lo actualiza en vez de crearlo
        return "Actualizado con éxito";
    }

    @PutMapping("/update")
    private String update2(@RequestBody User user) {

        userService.saveUser(user); //lo crea si no existe con un id

        return "Actualizado con éxito";
    }

    @GetMapping("/all")
    private List<User> getAll() {
        return userService.getUsers();
    }

    @DeleteMapping("/users/{id}")
    private String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id); //validar con exists
        return "eliminado";
    }
}
