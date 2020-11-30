package com.springboot.service;

import com.springboot.pojo.User;


import java.util.List;


public interface UserServer {
    User MybatisById(int Id);
    List<User> findUserServiceAll();
    void insert(User user);
    void deleteServById(int id);
}
