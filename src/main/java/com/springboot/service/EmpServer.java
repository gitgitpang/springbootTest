package com.springboot.service;

import com.springboot.pojo.Emp;

import java.util.List;

public interface EmpServer {
    Emp findByName(String ename);
    Emp selectById(Integer empno);
    List<Emp> findALL();
}
