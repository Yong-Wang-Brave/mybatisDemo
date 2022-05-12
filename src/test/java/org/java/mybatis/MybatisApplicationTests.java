package org.java.mybatis;

import org.java.mybatis.mapper.UserMapper;
import org.java.mybatis.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> list = userMapper.list();
        System.out.println(list);
    }

}

