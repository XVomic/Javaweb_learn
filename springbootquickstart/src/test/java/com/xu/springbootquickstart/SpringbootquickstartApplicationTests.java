package com.xu.springbootquickstart;

import com.xu.springbootquickstart.pojo.User;
import com.xu.springbootquickstart.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootquickstartApplicationTests {

    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {
//        User user=new User("zhangsan","123456");

        System.out.println("hello, you can test your app from here");
        userService.addUser("","");
//        userService.delUser("zhangsan");
    }
}
