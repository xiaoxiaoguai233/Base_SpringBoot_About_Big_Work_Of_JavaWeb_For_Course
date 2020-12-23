package com.java.dao;

import com.java.pojo.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    public User login(User user);
}
