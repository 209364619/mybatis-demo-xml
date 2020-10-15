//package com.hph.mysqlmybatis.mapper;
//
//import com.hph.mysqlmybatis.entity.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//class UserMapperTest {
//
//    @Autowired
//    UserMapper userMapper;
//    @Test
//    void selectAll() {
//        List<User> userList = userMapper.selectAll();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    void selectByName() {
//        List<User> userList = userMapper.selectByName("顾垃圾");
//        for (User user : userList) {
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    void selectAgeGte() {
//        List<User> userList = userMapper.selectAgeGte(10, 5, 0);
//        for (User user : userList) {
//            System.out.println(user);
//        }
//    }
//}