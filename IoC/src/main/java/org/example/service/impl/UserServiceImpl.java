package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }

}
