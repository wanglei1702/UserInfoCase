package com.wl.service;

import com.wl.domain.User;

import java.util.List;

public interface UserService {
    /*
    查询所有用户
     */
    public List<User> findAll();
}
