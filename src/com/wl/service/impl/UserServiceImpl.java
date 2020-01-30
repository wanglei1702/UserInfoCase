package com.wl.service.impl;

import com.wl.dao.UserDao;
import com.wl.dao.impl.UserDaoImpl;
import com.wl.domain.User;
import com.wl.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.findAll();

        return users;
    }
}
