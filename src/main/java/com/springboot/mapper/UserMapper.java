package com.springboot.mapper;

import com.springboot.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findById(int id);
}
