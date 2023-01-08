package com.example.mockitotest.dao;

import com.example.mockitotest.model.User;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final List<User>list;

    public UserDaoImpl() {
        this.list = Arrays.asList(
                new User("Антон", 27),
                new User("Сергей", 30),
                new User("Татьяна", 35),
                new User("Полина", 20)
        );
    }

    @Override
    public User findUserByName(String name) {
        for (User user: list){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return list;
    }
}
