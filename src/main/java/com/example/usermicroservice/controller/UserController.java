package com.example.usermicroservice.controller;

import com.example.usermicroservice.dao.dom.User;
import com.example.usermicroservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable long userId) {
        return this.userService.getUserBy(userId);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return this.userService.saveUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@PathVariable long userId) {
        this.userService.deleteUser(userId);
    }
}
