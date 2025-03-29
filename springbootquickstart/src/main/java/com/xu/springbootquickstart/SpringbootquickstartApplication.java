package com.xu.springbootquickstart;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootquickstartApplication {

//    @Autowired
//    static UserServiceImpl userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootquickstartApplication.class, args);
//        User user=new User("zhangsan","123456");
//        userService.addUser(user);
//        System.out.println("hello springboot");
//        Hello.say();
        System.out.println(Main.class.getClassLoader());

    }
}
