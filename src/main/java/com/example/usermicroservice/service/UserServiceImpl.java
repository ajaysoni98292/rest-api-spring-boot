package com.example.usermicroservice.service;

import com.example.usermicroservice.dao.UserDao;
import com.example.usermicroservice.dao.dom.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User saveUser(User user) {
        return this.userDao.saveUser(user);
    }

    @Override
    public User updateUser(User user) {
        return this.userDao.updateUser(user);
    }

    @Override
    public void deleteUser(long userId) {
        this.userDao.deleteUser(userId);
    }

    @Override
    public List<User> getUsers() {
        return this.userDao.getUsers();
    }

    @Override
    public User getUserBy(long userId) {
        return this.userDao.getUserBy(userId);
    }
}
