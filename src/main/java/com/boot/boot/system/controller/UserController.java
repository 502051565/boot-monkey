package com.boot.boot.system.controller;

import com.boot.boot.system.entity.User;
import com.boot.boot.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-02-20 15:48
 * @desc
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/index",method=RequestMethod.GET)
    public User index(){

        User user = userService.getById(1L);
        return user;
    }


}
