package com.xu.springbootquickstart.controller;

import com.xu.springbootquickstart.pojo.User;
import com.xu.springbootquickstart.service.UserServiceImpl;
import com.xu.springbootquickstart.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestParam(name="username") String username,
                          @RequestParam(name="password") String password){
        userService.addUser(username,password);
        return Result.okGetString();
    }

}
