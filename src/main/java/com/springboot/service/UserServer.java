package com.springboot.service;

import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserServer {
    User MybatisById(int Id);
    List<User> findUserAll();
    void insert(User user);
}
