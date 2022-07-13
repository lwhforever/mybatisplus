package com.lwh.mybaitsplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lwh.mybaitsplus.mapper.UserMapper;
import com.lwh.mybaitsplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusWrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.like("name","a")
                .between("age",20,30)
                .isNotNull("email");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }
}
