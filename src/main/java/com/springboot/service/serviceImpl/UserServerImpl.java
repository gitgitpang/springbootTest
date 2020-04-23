package com.springboot.service.serviceImpl;

import com.springboot.dao.UserDao;
import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.springboot.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class UserServerImpl implements UserServer {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findIdById(int id) {
        User user = userDao.findById(id).get();
        return user;
    }

    @Override
    public User MybatisById(int Id) {
        User mybatisUser = userMapper.findById(Id);
        return mybatisUser;
    }
}
