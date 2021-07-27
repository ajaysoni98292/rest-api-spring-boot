package com.example.usermicroservice.dao;

import com.example.usermicroservice.dao.dom.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
@Repository
public class UserDaoImpl implements UserDao {

    private final List<User> users;

    @Autowired
    public UserDaoImpl() {
        this.users = new ArrayList<>();
        User user = new User();
        user.setUserId(1);
        user.setName("ajay");
        this.users.add(user);
    }

    @Override
    public User saveUser(User user) {
        this.users.add(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        User saveUser = this.users.stream().filter(u -> u.getUserId() == user.getUserId()).findFirst().orElse(null);
        if (saveUser != null) {
            saveUser.setName(user.getName());
            saveUser.setContacts(user.getContacts());
            return saveUser;
        }
        return null;
    }

    @Override
    public void deleteUser(long userId) {
        this.users.stream().filter(u -> u.getUserId() == userId).findFirst().ifPresent(this.users::remove);
    }

    @Override
    public List<User> getUsers() {
        return this.users;
    }

    @Override
    public User getUserBy(long userId) {
        return this.users.stream().filter(u -> u.getUserId() == userId).findFirst().orElse(null);
    }
}
