package com.southwind.mybatisplus.mapper;

import com.southwind.mybatisplus.entity.account;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class accountMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    void test(){
        mapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save(){
        account user = new account();
        user.setTitle("小明");
        user.setAge(12);
        mapper.insert(user);

    }
}