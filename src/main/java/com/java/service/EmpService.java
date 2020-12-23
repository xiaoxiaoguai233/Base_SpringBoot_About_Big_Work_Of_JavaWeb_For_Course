package com.java.service;

import com.java.pojo.Department;
import com.java.pojo.Emp;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmpService {
    public List<Emp> listEmpAll();
    public Integer addEmp(Emp emp);
    //删除
    public Integer delete(Integer id);
    public Integer upDate(Emp emp);
    public Emp getEmpByid(Integer id);
    public List<Department> listTypeEmpAll();
}
