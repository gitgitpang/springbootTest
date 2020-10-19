package com.springboot.controller;

import com.springboot.pojo.Emp;
import com.springboot.service.EmpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpServer empServer;
    @RequestMapping("/find")
    public Emp findByName(@RequestParam(value="ename")String ename){
        Emp byName = empServer.findByName(ename);
        return byName;

    }
    @RequestMapping("/selectById")
    public Emp selectById(@RequestParam(value="empno")Integer empno){
        Emp emp = empServer.selectById(empno);
        return emp;

    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "欢迎欢迎";

    }
    @RequestMapping("/selectAll")
    public List<Emp> selectAll(){
        List<Emp> all = empServer.findALL();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Emp e:all) {
            String format = sdf.format(e.getHiredate());
            System.out.println(format);

        }
        return all;

    }
}
