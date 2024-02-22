package com.crmsystem.crmsys.service;

import com.crmsystem.crmsys.model.User;

public interface UserService {

    void save(User user);
    User findByName(String username);
}
