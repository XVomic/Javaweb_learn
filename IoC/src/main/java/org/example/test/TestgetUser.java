package org.example.test;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestgetUser {
    @Test
    public void testgetUser(){
//        UserDao userDao = new UserDaoImpl();
//        userDao.getUser();
        //下面这种不可以，需要使用applicationContext来获取对象
//        UserService userService = new UserServiceImpl();
//        userService.getUser();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
