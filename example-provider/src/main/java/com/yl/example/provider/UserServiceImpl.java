package com.yl.example.common.service.impl;

/**
 * @Author: LyonYL
 * @Date: 2025/4/28
 */

import com.yl.example.common.model.User;
import com.yl.example.common.service.UserService;

/**
 * 用户服务实现类
 */
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
