package com.hph.mysqlmybatis.service;

import com.hph.mysqlmybatis.entity.User;
import com.hph.mysqlmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findAll(){
        return userMapper.findAll();
    }
    public void insertUser(User user){
        userMapper.insertOne(user.getName(), user.getPasswd(), user.getGender(), user.getAge());
    }

    public void deleteById(Integer id){
        userMapper.deleteById(id);
    }
    public void updateUser(User user){
        userMapper.update(user);
    }
}
