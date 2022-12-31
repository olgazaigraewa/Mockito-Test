package com.example.mockitotest.service;

import com.example.mockitotest.dao.UserDao;
import com.example.mockitotest.model.User;

public class UserServiceImpl implements UserService {

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }


    @Override
    public boolean checkUserIsExist(User user) {

        return dao.findUserByName(user.getName())!=null;
    }
}
