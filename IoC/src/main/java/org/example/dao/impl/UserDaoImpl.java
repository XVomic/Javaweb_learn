package org.example.dao.impl;

import org.example.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("this is UerDaoImpl, it can operate the database");
    }
}
