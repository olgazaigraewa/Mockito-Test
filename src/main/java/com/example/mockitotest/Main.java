package com.example.mockitotest;

import com.example.mockitotest.dao.UserDaoImpl;

public class Main {
    private static final UserDaoImpl userDaoImpl = new UserDaoImpl();
    public static void main(String[] args) {

        System.out.println(userDaoImpl.findUserByName("Антон"));

        System.out.println(userDaoImpl.findUserByName("Мария"));

        System.out.println(new UserDaoImpl().findAll());







    }
    }

