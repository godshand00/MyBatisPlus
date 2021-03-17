package com.southwind.mybatisplus.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class CityMapperTest {

    @Autowired
    private CityMapper c;
    @Test
    public void cityTest(){
        c.selectList(null).forEach(System.out::println);

    }

}