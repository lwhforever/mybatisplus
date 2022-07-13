package com.lwh.mybaitsplus.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwh.mybaitsplus.mapper.UserMapper;
import com.lwh.mybaitsplus.pojo.User;
import com.lwh.mybaitsplus.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IService<User> {
}
