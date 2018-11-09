package com.dongnao.service;

import com.dongnao.dao.UserMapper;
import com.dongnao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: YuXD
 * @create: 2018-11-09 20:51
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer userId){
        return userMapper.getById(userId);
    }

}
