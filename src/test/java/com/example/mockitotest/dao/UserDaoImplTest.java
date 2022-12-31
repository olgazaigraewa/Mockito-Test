package com.example.mockitotest.dao;

import com.example.mockitotest.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class UserDaoImplTest {
    private  final User correctUser = new User("Антон", 27);
    private  final User incorrectUser = new User("Мария", 19);

    @Test
    public void findUserByName(){
        assertNotNull(new UserDaoImpl().findUserByName(correctUser.getName()));
    }

    @Test
    public void notFindUserByName(){
        assertNull(new UserDaoImpl().findUserByName(incorrectUser.getName()));
    }



    }



