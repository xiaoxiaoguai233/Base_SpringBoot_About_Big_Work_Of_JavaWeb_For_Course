package com.java.dao;

import com.java.pojo.Department;
import com.java.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EmpMapper {
    public List<Emp> listEmpAll();
    public List<Emp> getListDepartment();
    //添加
    public Integer addEmp(Emp emp);
    //删除
    public Integer delete(Integer id);

    public Integer upDate(Emp emp);

    public Emp getEmpByid(Integer id);

    public List<Department> listTypeEmpAll();

}
