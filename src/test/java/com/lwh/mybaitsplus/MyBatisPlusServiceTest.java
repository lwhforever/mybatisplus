package com.lwh.mybaitsplus;

import com.lwh.mybaitsplus.impl.UserServiceImpl;
import com.lwh.mybaitsplus.pojo.User;
import com.lwh.mybaitsplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Array;
import java.util.ArrayList;

@SpringBootTest
public class MyBatisPlusServiceTest {
    @Autowired
    private UserServiceImpl userServiceImpl;


    @Test
    public void testGet(){
        long count = userServiceImpl.count();
        System.out.println(count);
    }

    @Test
    public void testInsertMore(){
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            User user = new User();
            user.setName("lwh"+i);
            user.setAge(20+i);
            list.add(user);
        }
        boolean b = userServiceImpl.saveBatch(list);
        System.out.println(b);


    }
}
