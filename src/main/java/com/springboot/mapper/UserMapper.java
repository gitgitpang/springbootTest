package com.springboot.mapper;

import com.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    User findById(int id);
    List<User> findUserAll();
    void insert(User user);
    void deleteById(int id);
}
