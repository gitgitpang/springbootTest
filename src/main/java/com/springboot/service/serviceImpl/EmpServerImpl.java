package com.springboot.service.serviceImpl;

import com.springboot.mapper.EmpMapper;
import com.springboot.pojo.Emp;
import com.springboot.service.EmpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class EmpServerImpl implements EmpServer {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public Emp findByName(String ename) {
        Emp name = empMapper.findByName(ename);
        System.out.println(name);
        return name;
    }

    @Override
    public Emp selectById(Integer empno) {
        Emp emp = empMapper.selectByPrimaryKey(empno);

        return emp;
    }

    @Override
    public List<Emp> findALL() {
        List<Emp> all = empMapper.selectAll();
        return all;
    }
}
