package com.example.demo;

import org.java.mybatis.mapper.UserMapper;
import org.java.mybatis.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> list = userMapper.list();
        System.out.println(list);
    }

}
