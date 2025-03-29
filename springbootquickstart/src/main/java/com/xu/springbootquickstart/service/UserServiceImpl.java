package com.xu.springbootquickstart.service;

import com.xu.springbootquickstart.dao.UserDao;
import com.xu.springbootquickstart.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    UserDao userDao;

    public void addUser(String username,String password){

        userDao.insert(new User(username,password));
    }

    public void delUser(String username){
        userDao.deleteById(username);
    }
}
