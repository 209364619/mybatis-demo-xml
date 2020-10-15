package com.hph.mysqlmybatis.mapper;

import com.hph.mysqlmybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    void insertOne(String name,String passwd,String gender, Integer age);
    void deleteById(Integer id);
    void update(User user);
}
