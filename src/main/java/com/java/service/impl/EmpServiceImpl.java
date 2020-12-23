package com.java.service.impl;

import com.java.dao.EmpMapper;
import com.java.pojo.Department;
import com.java.pojo.Emp;
import com.java.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> listEmpAll() {
        return empMapper.listEmpAll();
    }
    @Override
    public Integer addEmp(Emp emp) {

        return empMapper.addEmp(emp);
    }

    @Override
    public Integer delete(Integer id) {

        return empMapper.delete(id);
    }

    @Override
    public Integer upDate(Emp emp) {

        return empMapper.upDate(emp);
    }

    @Override
    public Emp getEmpByid(Integer id) {

        return empMapper.getEmpByid(id);
    }

    @Override
    public List<Department> listTypeEmpAll() {

        return empMapper.listTypeEmpAll();
    }
}
