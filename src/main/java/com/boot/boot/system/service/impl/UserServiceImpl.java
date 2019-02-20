package com.boot.boot.system.service.impl;

import com.boot.boot.system.mapper.UserMapper;
import com.boot.boot.system.entity.User;
import com.boot.boot.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author monkey_lwy@163.com
 * @date 2019-02-20 15:58
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public User getById(Long id) {
        User user = userMapper.getById(id);
        return user;
    }
}
