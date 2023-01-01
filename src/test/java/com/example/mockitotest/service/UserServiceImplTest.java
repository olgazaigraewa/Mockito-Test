package com.example.mockitotest.service;

import com.example.mockitotest.dao.UserDao;
import com.example.mockitotest.dao.UserDaoImpl;
import com.example.mockitotest.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

   private final UserDao dao = Mockito.mock(UserDaoImpl.class);
   private final UserService userService = new UserServiceImpl(dao);


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