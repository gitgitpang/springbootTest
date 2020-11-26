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
    //根据条件查询
    public User mybatisIdByUser(@PathVariable(name = "id") int id){
        User mybatisuser = userServer.MybatisById(id);
        return mybatisuser;
    }
    //查询所有
    @RequestMapping("/selectUserByAll")
    public List<User> mybatisIdByUser(){
        List<User> userAll = userServer.findUserServiceAll();
        return userAll;
    }
    //向user表插入一条数据
    @RequestMapping("/user")
    public User findIdByUser(@RequestBody User user){
        userServer.insert(user);
        System.out.println("======");
        return user;
    }
    //根据id删除数据
    @RequestMapping("/deleteUserById/{id}")
    public void deleteUserById(@PathVariable(name = "id") int id){
        userServer.deleteServById(id);
    }
}
