package com.example.usermicroservice.service;

import com.example.usermicroservice.dao.dom.User;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
public interface UserService {

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(long userId);

    List<User> getUsers();

    User getUserBy(long userId);
}
