package com.wl.dao;

import com.wl.domain.User;
import java.util.List;

public interface UserDao {

    public List<User> findAll();
}
