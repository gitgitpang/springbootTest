package com.springboot.controller;
import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.springboot.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/springboot")
public class myspringbootTestcontroller {
    @Autowired
    private UserServer userServer;
    @RequestMapping("/show")
    public String showspringboot(){
        return "你已经进入springboot的世界";
    }

    @RequestMapping("/mybatisId/{id}")
    public User mybatisIdByUser(@PathVariable(name = "id") int id){
        User mybatisuser = userServer.MybatisById(id);
        return mybatisuser;
    }
    @RequestMapping("/selectUserByAll")
    public List<User> mybatisIdByUser(){
        List<User> userAll = userServer.findUserAll();
        for (User u: userAll ) {
            System.out.println(u);
        }

        return userAll;
    }
    //向user表插入一条数据
    @RequestMapping("/user")
    public User findIdByUser(@RequestBody User user){
        userServer.insert(user);
        System.out.println("======");
        return user;
    }
}
