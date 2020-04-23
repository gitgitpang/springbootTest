package com.springboot.service;

import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserServer {
    User findIdById(int id);
    User MybatisById(int Id);
}
