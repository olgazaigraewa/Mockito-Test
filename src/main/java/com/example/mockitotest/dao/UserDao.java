package com.example.mockitotest.dao;

import com.example.mockitotest.model.User;

import java.util.List;

public interface UserDao {

    User findUserByName(String name);
    List<User> findAll();

}
