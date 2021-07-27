package com.example.usermicroservice.dao;

import com.example.usermicroservice.dao.dom.User;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
public interface UserDao {

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(long userId);

    List<User> getUsers();

    User getUserBy(long userId);
}
