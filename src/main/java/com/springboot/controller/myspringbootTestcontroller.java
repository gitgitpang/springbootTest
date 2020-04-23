package com.springboot.controller;
import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.springboot.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class myspringbootTestcontroller {
    @Autowired
    private UserServer userServer;
    @RequestMapping("/show")
    public String showspringboot(){
        return "你已经进入springboot的世界";
    }
    @RequestMapping("/userId/{id}")
    public User findIdByUser(@PathVariable(name = "id") int id){
        User user = userServer.findIdById(id);
        return user;
    }
    @RequestMapping("/mybatisId/{id}")
    public User mybatisIdByUser(@PathVariable(name = "id") int id){
        User mybatisuser = userServer.MybatisById(id);
        return mybatisuser;
    }
}
