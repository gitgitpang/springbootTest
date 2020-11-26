package com.springboot.service.serviceImpl;

import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.springboot.service.UserServer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User MybatisById(int Id) {
        User mybatisUser = userMapper.findById(Id);
        return mybatisUser;
    }

    @Override
    public List<User> findUserServiceAll() {
        List<User> userAll = userMapper.findUserAll();
        return userAll;

    }

    @Override
    public void insert(User user) {
       // user.setGmtCreate(new Date());
        userMapper.insert(user);
    }

    @Override
    public void deleteServById(int id) {
        User deleteId = userMapper.findById(id);
        if(null!=deleteId) {
            userMapper.deleteById(id);
        }
    }
}
