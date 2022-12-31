package com.example.mockitotest.service;

import com.example.mockitotest.dao.UserDao;
import com.example.mockitotest.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserDao dao;
    private final UserService userService;

    public UserServiceImplTest() {
        MockitoAnnotations.initMocks(this);
        this.userService = new UserServiceImpl(dao);
    }

    /**
     * ставим заглушку
     */
    @Test
    public void checkUserExistIsTrue(){
        when(dao.findUserByName("Сергей")).thenReturn(new User("Сергей"));
        Assertions.assertTrue( userService.checkUserIsExist(new User("Сергей")));
    }
    @Test
    public void checkUserExistIsFalse() {
        when(dao.findUserByName("Сергей")).thenReturn(null);
        Assertions.assertFalse(userService.checkUserIsExist(new User("Сергей")));
    }


}