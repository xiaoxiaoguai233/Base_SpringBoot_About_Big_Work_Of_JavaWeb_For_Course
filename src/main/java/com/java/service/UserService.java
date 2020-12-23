package com.java.service;

import com.java.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User login(User user);
}
